import java.util.Scanner;

/**
 * Aufgabe 3: Eigene Methoden
 * Taschenrechner mit den vier Grundrechenarten.
 
 * WICHTIG bei 3.1: Wenn man zwei Strings mit "+" verknüpft, werden sie
 * aneinandergehängt statt addiert. "3" + "5" ergibt "35" und nicht 8.
 * Deshalb muss man die Eingabe als Zahl einlesen (nextDouble).
 */
public class Aufgabe03_Methoden {

    public static double addieren(double a, double b) {
        return a + b;
    }

    public static double subtrahieren(double a, double b) {
        return a - b;
    }

    public static double multiplizieren(double a, double b) {
        return a * b;
    }

    // Division
    public static double dividieren(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Teil 3.1: Was passiert bei String-Addition?

        
        System.out.println("--- Was passiert bei Strings? ---");
        String stringA = "3";
        String stringB = "5";
        System.out.println("\"3\" + \"5\" als Strings = " + (stringA + stringB));
        System.out.println("Das ergibt 35 statt 8! Deshalb brauchen wir Zahlenwerte.");
        System.out.println();

        // Teil 3.2 + 3.3: Taschenrechner
        
        System.out.print("Erste Zahl eingeben: ");
        double zahl1 = scanner.nextDouble();

        System.out.print("Zweite Zahl eingeben: ");
        double zahl2 = scanner.nextDouble();

        System.out.println("Welche Rechenart?");
        System.out.println("1 = Addition");
        System.out.println("2 = Subtraktion");
        System.out.println("3 = Multiplikation");
        System.out.println("4 = Division");
        System.out.print("Auswahl: ");
        int auswahl = scanner.nextInt();

        switch (auswahl) {
            case 1:
                System.out.println(zahl1 + " + " + zahl2 + " = " + addieren(zahl1, zahl2));
                break;
            case 2:
                System.out.println(zahl1 + " - " + zahl2 + " = " + subtrahieren(zahl1, zahl2));
                break;
            case 3:
                System.out.println(zahl1 + " * " + zahl2 + " = " + multiplizieren(zahl1, zahl2));
                break;
            case 4:
                if (zahl2 == 0) {
                    System.out.println("Fehler: Division durch 0 ist nicht erlaubt!");
                } else {
                    System.out.println(zahl1 + " / " + zahl2 + " = " + dividieren(zahl1, zahl2));
              
                }
                break;
            default:
                System.out.println("Ungültige Auswahl!");
                break;
        }
   
    }
}
