import java.util.Scanner;

// Aufgabe 12: Sparbuch Zinseszins 10 Jahre berechnen

public class Aufgabe12_Sparbuch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anfangsbetrag in EUR: ");
        double betrag = scanner.nextDouble();

        System.out.print("Zinssatz in %: ");
        double zinssatz = scanner.nextDouble();

        // Faktor aus der Aufgabenstellung
      
        double faktor = (100.0 + zinssatz) / 100.0;

        System.out.println("\nJahr | Betrag");
        System.out.println("-----|------------");
        System.out.println("  0  | " + Math.round(betrag * 100.0) / 100.0 + " EUR");

        for (int jahr = 1; jahr <= 10; jahr++) {
            betrag = betrag * faktor;
            System.out.println("  " + jahr + "  | " + Math.round(betrag * 100.0) / 100.0 + " EUR");
        }
   
  }
}

