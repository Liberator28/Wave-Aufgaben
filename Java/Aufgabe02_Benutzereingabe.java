import java.util.Scanner;

// Aufgabe 2: Benutzereingabe einlesen und begrüßen
public class Aufgabe02_Benutzereingabe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wie heißt du? ");
        String name = scanner.nextLine();

        System.out.println("Hallo " + name + "!");

        scanner.close();
    }
}

