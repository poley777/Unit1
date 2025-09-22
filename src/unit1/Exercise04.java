package unit1;

import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) {
        // Creamos un Scanner para leer datos del usuario
        Scanner reader = new Scanner(System.in);

        // Declaramos variables para las notas
        int nota1;
        int nota2;
        double media;

        // Solicitamos la primera nota
        System.out.print("Introduzca la primera nota (entera): ");
        nota1 = reader.nextInt();

        // Solicitamos la segunda nota
        System.out.print("Introduzca la segunda nota (entera): ");
        nota2 = reader.nextInt();

        // Calculamos la media aritmética (con decimales)
        media = (nota1 + nota2) / 2.0;

        // Mostramos la media
        System.out.println("La media de las dos notas es: " + media);

        // Cerramos el Scanner
        reader.close();
    }
}
