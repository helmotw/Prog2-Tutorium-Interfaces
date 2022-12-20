# Übung: Interfaces

Heute beschäftigen wir uns mit einem wichtigen Bestandteil der Abstraktion in Java.
Interfaces sind Klassen, welche als Vertrag dienen (Funktionalitäten vorgeben).
Vorteil dabei ist zum einen, das man verschiedene Implementation zum Interface erstellen kann.
Der andere Aspekt bezieht sich auf den Endnutzer, der sollte in den meisten Fällen nicht mitbekommen wie die eigentliche
Implementation funktioniert.

## Aufgabe

Du sollst für eine Kette von Eisverkäufern ein Verwaltungssystem schreiben.
Diese sollte die fundamentalen CRUD-Funktionen besitzen:

- Eis einfügen (nur wenn das Objekt Eisspeise und Verkaufsobjekt implementiert)
- Eis löschen (über die Seriennummer bzw. ID)
- Alle Eisspeisen in der Verwaltung listen
- Das Inspektionsdatum aktualisieren (über die Seriennummer bzw. ID)

Die Datenstruktur wurde vom Designer-Team festgelegt.