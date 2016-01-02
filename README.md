# software-engineering-group14
##WICHTIG!
- Für jeden Abschnitt eine eigene .tex Datei erstellen und mit einer passenden Ordnerstruktur arbeiten, um die Organisation zu vereinfachen
- Elemente in Modelio anzeigen lassen [Anleitung](https://forge.modelio.org/projects/modelio-user-manual-english-22/wiki/Modeler-_modeler_diagrams_showing_masking_elements "Liest das überhaupt jemand?")
- Austausch der UML-Diagramme über EMF .uml, bitte ausagekräftige Namen verwenden [Anleitung Export](https://forge.modelio.org/projects/modelio3-usermanual-english-300/wiki/Xmi_exporting "Wie man seine Daten Exportiert")
- Bilder wenn möglich als Vektorgrafik (.svg, .eps) oder als .png, kein .jpg!
- Sollte die 64-bit Version Probleme machen, sollte die 32-bit Version getestet werden [Download](https://www.modelio.org/downloads/download-modelio.html "Hier klicken!")
- Name des Klassendiagramms sollte dem des Packages entsprechen
- Keine Leerzeichen in Ordnern oder Dateinamen, statt dessen CamelCase verwenden!
- Für jedes Diagramm, auch jene die nur Angefangen wurden, sollte ein Bild exportiert werden, damit schnell und einfach abgeglichen werden kann
- Die eigene Arbeit sollte regelmäßig, am Besten an jedem Arbeitstag, gepushed werden, um das Absprechen zu vereinfachen.

# Coderzeugung
[Erzeugen](http://forge.modelio.org/projects/javadesigner-modelio3-user-manual-english/wiki/Javadesigner-_javadeveloper_generating_java_code_java_code_generation_functions)

[Reverse 1](http://forge.modelio.org/projects/javadesigner-modelio3-user-manual-english/wiki/Javadesigner-_javadeveloper_java_reverse_launching_reverse_command)

[Reverse 2](http://forge.modelio.org/projects/javadesigner-modelio3-user-manual-english/wiki/Javadesigner-_javadeveloper_java_reverse_functioning_reverse_tool)

[Allgemeine Anleitung](http://forge.modelio.org/projects/javadesigner-modelio3-user-manual-english/wiki)

# Sonstiges
[Beispieldokument](http://www.ecs.csun.edu/~rlingard/COMP684/Example2SoftArch.htm "sehr kurz")


# Komponenten im ArchitecturalDesign

Erläuterung: {} Symbolisiert das die Komponenten bereits gelistet wurden.

1. Client-Server
1.1 Layer bei Client (Präsentation - Logik)    

Generell:
1.1.1 Präsentation:
- Nutzerumgebung
- Paketverwaltung
- Modellerstellung
- Prognosen
1.1.2 Logik:
- Nutzer
- Paket
- Modellerstellung
- Prognosen
- REST-Schnittstelle

Login:
1.1.3 Präsentation:
- Loginpräsentation (1)
- Logincontroller (1)
- Admininstratorpräsentation (2)
- Admininstratorcontroller (2)
1.1.4 Logik:
- Loginmodell (1)
- Administratormodell (2)
- {REST-Schnittstelle}

(1),(2) verwenden jeweils das MVC-Pattern

Modellerstellung:
1.1.5 Präsentation:
- Modellerstellungspräsentation (3)
- Modellerstellungscontroller (3)
- Datensatzpräsentation (4)
- Datensatzcontroller (4)
- Algorithmenpräsentation (5)
- Algorithmencontroller (5)
1.1.6 Logik:
- Modellerstellungsmodell (3)
- Datensatzmodell (4)
- Algorithmenmodell (5)
- {REST-Schnittstelle}

(3),(4),(5) verwenden jeweils das MVC-Pattern


Pakete:
1.1.7 Präsentation:
- Paketpräsentation (6)
- Paketcontroller (6)
- Rechtecontroller
1.1.8 Logik:
- Paketmodell
- Rechtemodell
- {REST-Schnittstelle}

(6) verwendet das MVC-Pattern


Modellerstellung:
1.1.9 Präsentation:
- Prognosenspräsentation (7)
- Prognosencontroller (7)
- {Datensatzpräsentation (8)}
- {Datensatzcontroller (8)}
- Modellpräsentation (9)
- Modellcontroller (9)
1.1.10 Logik:
- Prognosenmodell (7)
- {Datensatzmodell (8)}
- Modell-modell (9)
- {REST-Schnittstelle}

(7),(8),(9) verwenden jeweils das MVC-Pattern


1.2 Layer bei Server (Logik - Data)

Generell:
1.2.1 Logik:
- REST-Schnittstelle
- Sicherheit
- Paketverwaltung
- Plugin-Loader
- Rechteverwaltung
- Nutzerverwaltung
1.2.2 Data:
- Datenzugriff
- Datenbank

1.3 Mikrokernel bei Server
- External Server ({Plugin-Loader})
- Java-Application (Ist das Programm an sich gemeint ?)
- Internal Server (Plugin/Algorithmus)
- Adapter
- Serverlogik

1.4 Reflection bei Server
- Internal Server
- Metadaten
- Algorithmus (WEKA-Libary sollte hier eingebunden werden)

# Vorgeschlagener Zeitplan (4. Phasen)
1. Bis zum 2.1. Modelio bedienen können (Anleitung lesen)
2. Bis zum 2.1. Komponenten des eigenen Moduls raussuchen, so dass eine Absprache möglich ist
3. Bis zum Dienstag erste Diagramme fertig
4. Ab Dienstag Text + fertiger Code.

 
