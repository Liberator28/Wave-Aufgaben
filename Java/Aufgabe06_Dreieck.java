import java.util.Scanner;

/**
 * Aufgabe 6: Dreieck und Tannenbaum zeichnen
 * 6.1: Gleichschenkliges Dreieck mit variabler Höhe.
 * 6.2: Tannenbaum (Dreieck mit Stamm).
 */
public class Aufgabe06_Dreieck {

    // Gibt ein gleichschenkliges Dreieck aus
    public static void zeichneDreieck(int hoehe) {
        for (int zeile = 1; zeile <= hoehe; zeile++) {
            // Leerzeichen vor den Sternchen für die Zentrierung
            for (int leer = 0; leer < hoehe - zeile; leer++) {
                System.out.print(" ");
            }
            // Sternchen: in Zeile 1 gibt es 1, in Zeile 2 gibt es 3, usw. -> 2*zeile-1
            for (int stern = 0; stern < 2 * zeile - 1; stern++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Tannenbaum = Dreieck + ein zentrierter Stamm darunter
    public static void zeichneTannenbaum(int hoehe) {
        zeichneDreieck(hoehe);

        // Stamm (ein einzelnes Sternchen, zentriert)
        for (int leer = 0; leer < hoehe - 1; leer++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Höhe des Dreiecks eingeben: ");
        int hoehe = scanner.nextInt();

        System.out.println("\n--- Dreieck ---");
        zeichneDreieck(hoehe);

        System.out.println("\n--- Tannenbaum ---");
        zeichneTannenbaum(hoehe);

        scanner.close();
    }
}

