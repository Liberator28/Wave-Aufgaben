/**
 * JS-Aufgabe 2: Würfelspiele
 * Simuliert einen Würfel mit Math.random().
 *
 * Varianten:
 
 * 1. Einzelner Wurf, Anzahl der Würfe zählen
 * 2. 100 Würfe, Sechser zählen
 * 3. Zwei Würfel, werfen bis beide gleich sind
 * 4. Zwei Würfel, werfen bis einer eine 6 zeigt
 * 5. Zwei Würfel, werfen bis einer 6 und der andere 1 zeigt
 * 6. Menü zur Auswahl der Varianten
 */

// Erzeugt eine Zufallszahl zwischen 1 und 6

function wuerfeln() {
    return Math.floor(Math.random() * 6) + 1;
}

// Variante 1: Einmal würfeln, Anzahl der Würfe ausgeben

function variante1() {
    var ergebnis = wuerfeln();
    console.log("Variante 1: Gewürfelt wurde eine " + ergebnis + " (1 Wurf).");
}

// Variante 2: 100 Würfe, Sechser zählen

function variante2() {
    var sechserZaehler = 0;

    for (var i = 0; i < 100; i++) {
        if (wuerfeln() === 6) {
            sechserZaehler++;
        }
    }

    console.log("Variante 2: Bei 100 Würfen gab es " + sechserZaehler + " Sechser.");
}

// Variante 3: Zwei Würfel werfen bis beide gleich

function variante3() {
    var wuerfe = 0;
    var w1, w2;

    do {
        w1 = wuerfeln();
        w2 = wuerfeln();
        wuerfe++;
    } while (w1 !== w2);

    console.log("Variante 3: Nach " + wuerfe + " Würfen zeigen beide eine " + w1 + ".");
}

// Variante 4: Zwei Würfel werfen bis einer 6 zeigt

function variante4() {
    var wuerfe = 0;
    var w1, w2;

    do {
        w1 = wuerfeln();
        w2 = wuerfeln();
        wuerfe++;
    } while (w1 !== 6 && w2 !== 6);

    console.log("Variante 4: Nach " + wuerfe + " Würfen hat ein Würfel eine 6 (" + w1 + "/" + w2 + ").");
}

// Variante 5: Zwei Würfel werfen bis einer 6 und der andere 1 zeigt

function variante5() {
    var wuerfe = 0;
    var w1, w2;

    do {
        w1 = wuerfeln();
        w2 = wuerfeln();
        wuerfe++;
    } while (!((w1 === 6 && w2 === 1) || (w1 === 1 && w2 === 6)));

    console.log("Variante 5: Nach " + wuerfe + " Würfen: " + w1 + " und " + w2 + ".");
}

// Variante 6: Interaktives Menü zur Auswahl der Varianten

function menue() {
    var auswahl;

    do {
        auswahl = prompt(
            "Würfelspiele - Variante wählen:\n" +
            "1 = Einmal würfeln\n" +
            "2 = 100 Würfe, Sechser zählen\n" +
            "3 = Zwei Würfel bis gleich\n" +
            "4 = Zwei Würfel bis einer 6 zeigt\n" +
            "5 = Zwei Würfel bis 6 und 1\n" +
            "0 = Beenden"
        );

       
      switch (auswahl) {
            case "1": variante1(); break;
            case "2": variante2(); break;
            case "3": variante3(); break;
            case "4": variante4(); break;
            case "5": variante5(); break;
            case "0": console.log("Programm beendet."); break;
            case null: auswahl = "0"; break; // Abbrechen-Button
            default: console.log("Ungültige Auswahl. Bitte 1-5 oder 0 eingeben.");
      
        }
    } while (auswahl !== "0");
}

// Programm starten: Menü anzeigen

menue();
