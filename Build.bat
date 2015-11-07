echo.>inputs.tex
dir /B /S  requirements\*.tex> temp.txt
sort temp.txt /O temp.txt
for /f "tokens=1,* delims=]" %%A in ('"type temp.txt|find /n /v """') do (
    set "line=%%B"
    if defined line (
        call set "line=echo.\input{%%line:\=/%%}"
        for /f "delims=" %%X in ('"echo."%%line%%""') do %%~X>>inputs.tex
    ) ELSE echo.
)

@echo off

set drive=%~dp0\perl\
set drivep=%drive%
if #%drive:~-1%# == #\# set drivep=%drive:~0,-1%

set PATH=%drivep%\perl\site\bin;%drivep%\perl\bin;%drivep%\c\bin;%PATH%
rem env variables
set TERM=
set HOME=%~dp0data
set PLPLOT_LIB=%~dp0c\share\plplot
set PLPLOT_DRV_DIR=%~dp0c\share\plplot
rem avoid collisions with other perl stuff on your system
set PERL_JSON_BACKEND=
set PERL_YAML_BACKEND=
set PERL5LIB=
set PERL5OPT=
set PERL_MM_OPT=
set PERL_MB_OPT=

::if not #%1# == ## "%drivep%\perl\bin\perl.exe" %* & goto END

perl -MConfig -MPDL -e "printf("""Perl executable: %%s\nPerl version   : %%vd / $Config{archname}\nPDL version    : %%s\n""", $^X, $^V, $PDL::VERSION)" 2>nul
if ERRORLEVEL==1 echo.&echo FATAL ERROR: 'perl' does not work; check if your strawberry pack is complete!
echo.

latex %1 
makeglossaries %1 
latex %1 
makeglossaries %1 
latex %1 
pdflatex %1 
::dvips %1 
::ps2pdf %1.ps

:END
