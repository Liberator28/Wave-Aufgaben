import java.util.Scanner;

/**
 * Aufgabe 10: Zahlensysteme umrechnen
 * Menü: Z)eichen, O)ktal, heX), E)nde?
 */



public class Aufgabe10_Zahlensysteme {

    // Dezimalzahl in Binär umwandeln
  
    public static String dezimalZuBinaer(int dezimal) {
        if (dezimal == 0) {
            return "0";
        }
        String binaer = "";
        int wert = dezimal;
        while (wert > 0) {
            binaer = (wert % 2) + binaer;
            wert = wert / 2;
        }
        return binaer;
    }

    // Oktal-String in Dezimalzahl umwandeln
  
    public static int oktalZuDezimal(String oktal) {
        int dezimal = 0;
        for (int i = 0; i < oktal.length(); i++) {
            int ziffer = oktal.charAt(i) - '0';
            if (ziffer < 0 || ziffer > 7) {
                System.out.println("Ungültige Oktalziffer: " + oktal.charAt(i));
                return -1;
            }
            dezimal = dezimal * 8 + ziffer;
        }
        return dezimal;
    }

    // Hex-String in Dezimalzahl umwandeln
  
    public static int hexZuDezimal(String hex) {
        int dezimal = 0;
        hex = hex.toUpperCase();
        for (int i = 0; i < hex.length(); i++) {
            char zeichen = hex.charAt(i);
            int wert;
            if (zeichen >= '0' && zeichen <= '9') {
                wert = zeichen - '0';
            } else if (zeichen >= 'A' && zeichen <= 'F') {
                wert = 10 + (zeichen - 'A');
            } else {
                System.out.println("Ungültige Hex-Ziffer: " + zeichen);
                return -1;
            }
            
          dezimal = dezimal * 16 + wert;
        }
        return dezimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean weiter = true;

        while (weiter) {
            System.out.println("\nMenü: Z)eichen, O)ktal, heX), E)nde?");
            System.out.print("Auswahl: ");
            String auswahl = scanner.nextLine().trim().toUpperCase();

            if (auswahl.equals("Z")) {
                System.out.print("Zeichen eingeben: ");
                String eingabe = scanner.nextLine();
                if (eingabe.length() > 0) {
                    char zeichen = eingabe.charAt(0);
                    int wert = (int) zeichen;
                    System.out.println("Zeichen: '" + zeichen + "'");
                    System.out.println("Dezimal: " + wert);
                    System.out.println("Binär:   " + dezimalZuBinaer(wert));
                }

            } else if (auswahl.equals("O")) {
                System.out.print("Oktalzahl eingeben: ");
                String eingabe = scanner.nextLine().trim();
                int ergebnis = oktalZuDezimal(eingabe);
                if (ergebnis >= 0) {
                    System.out.println("Oktal:   " + eingabe);
                    System.out.println("Dezimal: " + ergebnis);
                    System.out.println("Binär:   " + dezimalZuBinaer(ergebnis));
                
                }

            } else if (auswahl.equals("X")) {
                System.out.print("Hexadezimalzahl eingeben: ");
                String eingabe = scanner.nextLine().trim();
                int ergebnis = hexZuDezimal(eingabe);
                if (ergebnis >= 0) {
                    System.out.println("Hex:     " + eingabe);
                    System.out.println("Dezimal: " + ergebnis);
                    System.out.println("Binär:   " + dezimalZuBinaer(ergebnis));
                }

            } else if (auswahl.equals("E")) {
                System.out.println("Programm beendet.");
                weiter = false;

            } else {
                System.out.println("Ungültige Eingabe!");
           
            }
        }
    }
}
