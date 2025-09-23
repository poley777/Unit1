package unit1;

import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {
        // We created a new Scanner
        Scanner reader = new Scanner(System.in);

        // We declare the variable number
        int numero;

        // We show the message to ask for the age.
        System.out.println("Introduzca su edad:");

        // We read an integer value from the console
        numero = reader.nextInt();

        // We show how old you will be next year
        System.out.println("Su edad el próximo año será: " + (numero + 1));

        // We close the Scanner
        reader.close();
    }
}
