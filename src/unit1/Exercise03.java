package unit1;

import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {
        // We create a new Scanner to read user input
        Scanner reader = new Scanner(System.in);

        // Variables to store the current year and the year of birth
        int anioActual;
        int anioNacimiento;
        int edad;

        // We ask the user for the current year
        System.out.print("Introduzca el año actual: ");
        anioActual = reader.nextInt();

        // We ask the user for the year of birth
        System.out.print("Introduzca su año de nacimiento: ");
        anioNacimiento = reader.nextInt();

        // We calculate the age
        edad = anioActual - anioNacimiento;

        // We show the age
        System.out.println("Su edad es: " + edad + " años.");

        // We close the Scanner
        reader.close();
    }
}
