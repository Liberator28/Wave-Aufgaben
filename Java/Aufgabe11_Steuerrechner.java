import java.util.Scanner;

// Aufgabe 11: Steuerrechner
// Formel aus der Aufgabe: Steuerbetrag = brutto * prozentsatz / (100 + prozentsatz)


public class Aufgabe11_Steuerrechner {

    public static double steuerBerechnen(double brutto, double prozentsatz) {
        return brutto * prozentsatz / (100 + prozentsatz);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Teil 1 Festes Beispiel 100€ mit 20% USt.
      
        System.out.println("--- Teil 1: Festes Beispiel ---");
        double brutto1 = 100.0;
        double ust1 = 20.0;
        double steuer1 = steuerBerechnen(brutto1, ust1);
        double netto1 = brutto1 - steuer1;

        System.out.println("Bruttopreis: " + brutto1 + " EUR");
        System.out.println("USt. (20%):  " + Math.round(steuer1 * 100.0) / 100.0 + " EUR");
        System.out.println("Nettopreis:  " + Math.round(netto1 * 100.0) / 100.0 + " EUR");

        // Teil 2 Eigene Werte für Eingabe
      
        System.out.println("\n--- Teil 2: Eigene Werte ---");
        System.out.print("Bruttopreis in EUR: ");
        double brutto2 = scanner.nextDouble();

        System.out.print("USt.-Satz in %: ");
        double ust2 = scanner.nextDouble();

        double steuer2 = steuerBerechnen(brutto2, ust2);
        double netto2 = brutto2 - steuer2;

        System.out.println("\nBruttopreis: " + brutto2 + " EUR");
        System.out.println("Steuer:      " + Math.round(steuer2 * 100.0) / 100.0 + " EUR");
        System.out.println("Nettopreis:  " + Math.round(netto2 * 100.0) / 100.0 + " EUR");
   
    }
}

