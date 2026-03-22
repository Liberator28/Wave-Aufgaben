import java.util.Scanner;

/**
 * Aufgabe 7: Pascalsches Dreieck
 * Jede Zahl ist die Summe der beiden darüberliegenden Zahlen.
 * Die Ränder sind immer 1.
 
 * Beispiel
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 5 1
 */

public class Aufgabe07_PascalschesDreieck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anzahl der Zeilen eingeben: ");
        int zeilen = scanner.nextInt();

        // 2D-Array für das Dreieck anlegen
        int[][] dreieck = new int[zeilen][];

        for (int i = 0; i < zeilen; i++) {
            // Jede Zeile hat i+1 Elemente
            dreieck[i] = new int[i + 1];

            
            // Erstes und letztes Element jeder Zeile ist 1
            dreieck[i][0] = 1;
            dreieck[i][i] = 1;

            // Innere Werte: Summe der beiden darüberliegenden Werte
            for (int j = 1; j < i; j++) {
                dreieck[i][j] = dreieck[i - 1][j - 1] + dreieck[i - 1][j];
            }
       
        
        }

        // Ausgabe
        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(dreieck[i][j]);
                if (j < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

