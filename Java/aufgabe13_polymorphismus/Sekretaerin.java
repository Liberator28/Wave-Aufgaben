/**

 * Aufgabe 13: Sekretärin
 
 * Bekommt ein festes Gehalt pro Monat.
 */

public class Sekretaerin extends Angestellter {

    private double festgehalt;

    public Sekretaerin(String name, double festgehalt) {
        super(name);
        this.festgehalt = festgehalt;
    }

    public double getFestgehalt() {
        return festgehalt;
    }

    public void setFestgehalt(double festgehalt) {
        this.festgehalt = festgehalt;
    }

    @Override
    public double getMonthlyPay() {
        return festgehalt;
    }
  
}
