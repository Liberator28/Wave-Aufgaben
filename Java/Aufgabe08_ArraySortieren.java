/**
 * Aufgabe 8: Array sortieren
 * Ohne Arrays.sort() oder Collections.sort()!
 * Ich benutze Bubble Sort
 */

public class Aufgabe08_ArraySortieren {

    public static void main(String[] args) {
        int[] original = {45, 52, 2, 1, 0, 98, 445, 4, 42, 65, 3, 12, 11, 20, 42};

        // Zwei Kopien anlegen damit das Original erhalten bleibt
        int[] aufsteigend = new int[original.length];
        int[] absteigend = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            aufsteigend[i] = original[i];
            absteigend[i] = original[i];
        }

        
      // Bubble Sort aufsteigend
        for (int i = 0; i < aufsteigend.length - 1; i++) {
            for (int j = 0; j < aufsteigend.length - 1 - i; j++) {
                if (aufsteigend[j] > aufsteigend[j + 1]) {
                    int temp = aufsteigend[j];
                    aufsteigend[j] = aufsteigend[j + 1];
                    aufsteigend[j + 1] = temp;
                }
          
            }
        }

        // Bubble Sort absteigend (gleich, nur < statt >)
        for (int i = 0; i < absteigend.length - 1; i++) {
            for (int j = 0; j < absteigend.length - 1 - i; j++) {
                if (absteigend[j] < absteigend[j + 1]) {
                    int temp = absteigend[j];
                    absteigend[j] = absteigend[j + 1];
                    absteigend[j + 1] = temp;
                }
            }
        }

        // Original ausgeben
        System.out.print("Original:    {");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i]);
            if (i < original.length - 1) System.out.print(", ");
        }
        System.out.println("}");

        // Aufsteigend
        System.out.print("Aufsteigend: {");
        for (int i = 0; i < aufsteigend.length; i++) {
            System.out.print(aufsteigend[i]);
            if (i < aufsteigend.length - 1) System.out.print(", ");
        }
        System.out.println("}");

        // Absteigend
        System.out.print("Absteigend:  {");
        for (int i = 0; i < absteigend.length; i++) {
            System.out.print(absteigend[i]);
            if (i < absteigend.length - 1) System.out.print(", ");
        }
        System.out.println("}");
    }
}

