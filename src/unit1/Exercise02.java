package unit1;

import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {
        // Creamos un nuevo Scanner
        Scanner reader = new Scanner(System.in);

        // Declaramos la variable numero
        int numero;

        // Mostramos el mensaje para pedir la edad
        System.out.println("Introduzca su edad:");

        // Leemos un valor entero desde la consola
        numero = reader.nextInt();

        // Mostramos la edad que tendrá el próximo año
        System.out.println("Su edad el próximo año será: " + (numero + 1));

        // Cerramos el Scanner
        reader.close();
    }
}
