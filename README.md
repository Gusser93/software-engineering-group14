# software-engineering-group14

Git: https://github.com/Gusser93/software-engineering-group14

-Webservice
-REST basiert (Webserver-Programm)
-keine Rückmeldung, da Zustandlos
-Weka (https://de.wikipedia.org/wiki/Waikato_Environment_for_Knowledge_Analysis)
-RDF
-Hochgeladene Daten sind Personen bezogen.
-Datenbank speichert Modelle, Daten...
-Schnittstelle soll Modell aus Datenbank lesen und auf Daten anwenden
-Reihenfolge: 1. Es werden Daten geschickt, 2. Mit den Daten werden gerechnet, 3. Das Ergebniss wird zurückgegeben
-Ausgabe auf einer Webseite "benutzerfreundlich", als Text und als Grafik
-Rechtevergabe
-Modelle sind Ergebnisse von Daten und Algorithmen
-Man kann neue Daten auf ein bekanntes Modell anwenden
-Man kann ein neues Modell erstellen
-"Modell wird gelern aus einem Algoritmus mit Daten"
-Daten sind bereits vorhanden als Datei auf dem Client System
-Beispeil: Maus entwickelt bei bestimmten Molekülen aus einem Datensatz einen Tumor (=Modell). Nun wird ein neues Molekül eingegeben und das System versucht vorherzusagen, ob die Maus daraus auch einen Tumor entwickelt.
-Der Algorithmus, der das Modell trainiert, wird bereitgestellt
-1.Datensatz wird geteilt, ein Teil Training, ein Teil Test, dieser läuft durch einen Algorithmus, darauß entsteht ein Modell
-2. Für einen neuen Datensatz kann über ein Modell ein eine Vorhersage getroffen werden
-3. Modell kann mit einem neuen Datensatz trainiert und evauliert werden
-SPRQURL
-https://www.browser-statistik.de/statistiken/versionen/

User Requirements
-Benutzer sollen eigene Daten administrieren dürfen (bearbeitung, sehen, löschen)
-Auch Gast-Nutzer möglich (mit beschränkten Privilegien)
-Userverwaltung
-Datensätze können AnoAnonym sein
-Anmelde Daten (E-Mail-Adresse, Passwort)
-Multi-Server-Netwerk (z.B. einer für Daten, einer für Modelle, einer zur Berechnung)
-keine Versionsverwaltung
-man kann Modelle trainieren
-Modelle und Ergebnisse sollen downloadbar sein.
-Modelle sind unter URI eindeutig zu finden, sollen benannt werden können
-Benutzergruppen im Sinne von Gruppenbearbeitung
-Soll in allen gängigen Browsern laufen
-Mobil abrufbar
-automatische Backups (täglich, wöchtenlich und monatlich)
-kein Safari und kein Internet Explorer
-konform zu allen iii Zeug
-Einmal im Monat für 10min down
-Berrechnug von Daten dauert bis 200mb 10min...
