package unit1;

import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {
        // Creamos un nuevo Scanner para leer entrada del usuario
        Scanner reader = new Scanner(System.in);

        // Variables para almacenar el año actual y el año de nacimiento
        int anioActual;
        int anioNacimiento;
        int edad;

        // Pedimos al usuario el año actual
        System.out.print("Introduzca el año actual: ");
        anioActual = reader.nextInt();

        // Pedimos al usuario el año de nacimiento
        System.out.print("Introduzca su año de nacimiento: ");
        anioNacimiento = reader.nextInt();

        // Calculamos la edad
        edad = anioActual - anioNacimiento;

        // Mostramos la edad
        System.out.println("Su edad es: " + edad + " años.");

        // Cerramos el Scanner
        reader.close();
    }
}
