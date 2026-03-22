 Aufgabe 13: Testprogramm für Polymorphismus
   
// Verschiedene Angestellte werden erzeugt und das Gehalt berechnet.
// Durch Polymorphismus wird automatisch die richtige getMonthlyPay()-Methode aufgerufen ohne dass wir prüfen müssen welcher Typ es ist.

   public class Aufgabe13_TestPolymorphismus {

    public static void main(String[] args) {

        // Array vom Typ der Basisklasse
        Angestellter[] team = new Angestellter[5];

        team[0] = new Sekretaerin("Anna Müller", 2800.00);
        team[1] = new Sekretaerin("Lisa Schmidt", 3000.00);
        team[2] = new Verkaeufer("Tom Wagner", 2500.00, 20000.00, 5.0);
        // Manager: in der GF, 15 Mitarbeiter, 12 Jahre dabei -> alle 3 Zulagen
        team[3] = new Manager("Klaus Fischer", 5000.00, 500.00, true, 15, 12);
        // Manager: keine GF, 8 Mitarbeiter, 5 Jahre -> 0 Zulagen
        team[4] = new Manager("Peter Braun", 4500.00, 500.00, false, 8, 5);

        System.out.println("=== Gehaltsabrechnung ===\n");

        // Keine instanceof-Prüfung nötig das passiert durch Polymorphismus automatisch
      
        for (int i = 0; i < team.length; i++) {
            System.out.println(team[i].getName() + ":");
            System.out.println("  Monatsgehalt: " + team[i].getMonthlyPay() + " EUR");
            System.out.println("  Jahresgehalt: " + team[i].getYearlyPay() + " EUR");
            System.out.println();
        }
    }
   
}
