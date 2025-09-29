package Part1;

import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) {
        // We create a Scanner to read user data
        Scanner reader = new Scanner(System.in);

        // We declare variables for the notes
        int nota1;
        int nota2;
        double media;

        // We request the first note
        System.out.print("Introduzca la primera nota (entera): ");
        nota1 = reader.nextInt();

        // We request the second note
        System.out.print("Introduzca la segunda nota (entera): ");
        nota2 = reader.nextInt();

        // We calculate the arithmetic mean (with decimals)
        media = (nota1 + nota2) / 2.0;

        // We show the average
        System.out.println("La media de las dos notas es: " + media);

        // We close the Scanner
        reader.close();
    }
}
