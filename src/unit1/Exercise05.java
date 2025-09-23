package unit1;

import java.util.Scanner;

import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {
        // We create a Scanner to read from the user
        Scanner reader = new Scanner(System.in);

        // Variable for radius
        double radio;
        
        //Variable for length
        double longitud;
        
        //Variable for area
        double area;

        // We ask the user to enter the radius
        System.out.print("Introduzca el radio de la circunferencia (puede tener decimales): ");
        radio = reader.nextDouble();

        // We calculate the length and area
        longitud = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio, 2);

        // We show the results
        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área de la circunferencia es: " + area);
    
        // We close the Scanner
        reader.close();
    }
}