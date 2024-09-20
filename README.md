Aufgabe: Simuliere eine Supermarktkasse
Erstelle eine einfache Simulation eines Supermarktes mit nur einer Kasse. Die Kunden in dieser Simulation sind Threads. Jeder Kunde kauft eine zufällige Anzahl von Artikeln (zwischen 1 und 10), und es dauert eine feste Zeit, um jeden Artikel zu scannen.
Die Hauptpunkte der Aufgabe sind:
Jeder "Kunde" ist ein Thread.
Die "Kasse" ist eine Ressource, die nur von einem Thread zur gleichen Zeit genutzt werden kann.
Jeder Kunde "kauft" eine zufällige Anzahl von Artikeln (du kannst die Anzahl beim Erzeugen des Kunden zufällig festlegen).
Jeder Artikel benötigt eine bestimmte Zeit zum "Scannen" (z.B. 1 Sekunde).
Nachdem alle Artikel eines Kunden gescannt wurden, beendet der Thread seine Ausführung.
Verwende die Konsole, um den Fortschritt der Kasse zu zeigen, z.B. wann ein Kunde ankommt, wie viele Artikel er hat, wann er anfängt und aufhört zu scannen, etc.
Du brauchst hierfür nur zwei Klassen: Kunde (die den Thread repräsentiert) und Supermarkt (die die main-Methode enthält, um die Simulation zu starten). Du könntest auch eine dritte Klasse, Kasse, erstellen, um den Scannprozess zu verwalten, aber das ist optional und du könntest diesen Teil in der Kunde Klasse selbst verwalten.
