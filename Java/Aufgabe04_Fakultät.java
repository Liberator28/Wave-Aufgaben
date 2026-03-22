import java.util.Scanner;

// Aufgabe 4: Fakultät einer Zahl berechnen
// Die Fakultät von 5 ist z.B. 1*2*3*4*5 = 120
// 0 ist per Definition = 1
public class Aufgabe04_Fakultaet {

    public static long fakultaet(int n) {
        long ergebnis = 1;
        for (int i = 2; i <= n; i++) {
            ergebnis = ergebnis * i;
        }
        return ergebnis;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zahl eingeben: ");
        int zahl = scanner.nextInt();

        if (zahl < 0) {
            System.out.println("Fehler: Fakultät gibt es nur für positive Zahlen!");
        } else {
            System.out.println(zahl + "! = " + fakultaet(zahl));
        }
   
    }
}

