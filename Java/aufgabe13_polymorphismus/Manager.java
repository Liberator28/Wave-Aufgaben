/**
 
 * Aufgabe 13: Manager
 * Bekommt ein festes Gehalt plus Zulagen für bestimmte Aktivitäten

 * 1. Mitglied der Geschäftsführung
 * 2. Führungskraft für mehr als 12 Mitarbeiter
 * 3. Mehr als 10-jährige Firmenzugehörigkeit

 * Für jede zutreffende Bedingung gibt es eine Zulage
 
 */
public class Manager extends Angestellter {

    private double festgehalt;
    private double zulageProAktivitaet;
    private boolean geschaeftsfuehrung;
    private int anzahlMitarbeiter;
    private int jahreImUnternehmen;

    public Manager(String name, double festgehalt, double zulageProAktivitaet,
                   boolean geschaeftsfuehrung, int anzahlMitarbeiter, int jahreImUnternehmen) {
        super(name);
        this.festgehalt = festgehalt;
        this.zulageProAktivitaet = zulageProAktivitaet;
        this.geschaeftsfuehrung = geschaeftsfuehrung;
        this.anzahlMitarbeiter = anzahlMitarbeiter;
        this.jahreImUnternehmen = jahreImUnternehmen;
    }

    public double getFestgehalt() {
        return festgehalt;
    }

    public boolean isGeschaeftsfuehrung() {
        return geschaeftsfuehrung;
    }

    public int getAnzahlMitarbeiter() {
        return anzahlMitarbeiter;
    }

    public int getJahreImUnternehmen() {
        return jahreImUnternehmen;
    }

    public double getZulageProAktivitaet() {
        return zulageProAktivitaet;
    }

    // Zählt wie viele der drei Bedingungen zutreffen (0 bis 3)
  
    public int getAnzahlZulagen() {
        int anzahl = 0;
        if (geschaeftsfuehrung) {
            anzahl++;
        }
        if (anzahlMitarbeiter > 12) {
            anzahl++;
        }
        if (jahreImUnternehmen > 10) {
            anzahl++;
        }
        return anzahl;
    }

    public double getGesamtzulage() {
        return getAnzahlZulagen() * zulageProAktivitaet;
    }

    @Override
    public double getMonthlyPay() {
        return festgehalt + getGesamtzulage();
   
    }
}
