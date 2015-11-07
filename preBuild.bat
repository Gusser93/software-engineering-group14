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