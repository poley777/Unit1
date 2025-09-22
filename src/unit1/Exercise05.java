package unit1;

import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {
        // Creamos un Scanner para leer del usuario
        Scanner reader = new Scanner(System.in);

        // Variable para el radio
        double radio;

        // Pedimos al usuario que introduzca el radio
        System.out.print("Introduzca el radio de la circunferencia (puede tener decimales): ");
        radio = reader.nextDouble();

        // Calculamos la longitud y el área
        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);

        // Mostramos los resultados
        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área de la circunferencia es: " + area);

        // Cerramos el Scanner
        reader.close();
    }
}
