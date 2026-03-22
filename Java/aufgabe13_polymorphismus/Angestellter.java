/**
 * Aufgabe 13: Polymorphismus
 
 * Abstrakte Basisklasse für alle Angestellten
 * - getMonthlyPay() ist abstrakt und wird in den Unterklassen implementiert.
 * - getYearlyPay() ist bereits hier implementiert: 12 * Monatsgehalt.
 */

public abstract class Angestellter {

    private String name;

    public Angestellter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstrakte Methode: wird in Unterklassen konkret implementiert
  
    public abstract double getMonthlyPay();

    // Jahresgehalt = 12 Monatsgehälter
  
    public double getYearlyPay() {
        return getMonthlyPay() * 12;  }
}

