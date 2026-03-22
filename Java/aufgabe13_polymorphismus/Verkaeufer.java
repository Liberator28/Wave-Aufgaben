/**

 * Aufgabe 13: Verkäufer
 * Bekommt ein festes Gehalt plus anteilige Verkaufsprovisionen.
 */

public class Verkaeufer extends Angestellter {

    private double festgehalt;
    private double umsatz;          // monatlicher Verkaufsumsatz
    private double provisionsSatz;  // Provisionssatz in % 

    public Verkaeufer(String name, double festgehalt, double umsatz, double provisionsSatz) {
        super(name);
        this.festgehalt = festgehalt;
        this.umsatz = umsatz;
        this.provisionsSatz = provisionsSatz;
      
    }

    public double getFestgehalt() {
        return festgehalt;
    }

    public double getUmsatz() {
        return umsatz;
    }

    public double getProvisionsSatz() {
        return provisionsSatz;
    }

    public double getProvision() {
        return umsatz * provisionsSatz / 100.0;
    }

    public void setUmsatz(double umsatz) {
        this.umsatz = umsatz;
    }

    @Override
    public double getMonthlyPay() {
        return festgehalt + getProvision();
   
    }
}
