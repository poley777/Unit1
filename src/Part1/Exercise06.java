package Part1;

import java.util.Scanner;

import java.util.Locale;

public class Exercise06 {

	public static void main(String[] args) {
		// We create a Scanner to read from the user
		Scanner reader =new Scanner(System.in);
		
		//We declare variable for the first number
		double numero1;
			
		//We declare variable for the second number
		double numero2;
		
		//We declare the variable for the sum
		double suma;
		
		//We declare the variable for the subtraction
		double resta;
		
		//We declare the variable for the multiplication
		double multiplicación;
		
		//We declare the variable for the division
		double división;
		
		// We request the first number
        System.out.print("Introduzca el primer número: ");
        numero1 = reader.nextDouble();
        
        // We request the second number
        System.out.print("Introduzca el segundo número: ");
        numero2 = reader.nextDouble();
        
        // We calculate the sum. subtraction, multiplication and division
        suma = numero1+numero2;
        resta = numero1-numero2;
        multiplicación = numero1*numero2;
        división = numero1/numero2;
        
        // We show the results
        System.out.println("La suma de los números es: " + suma);
        System.out.println("La resta de los números es: " + resta);
        System.out.println("La multiplicación de los números es: " + multiplicación);
        System.out.println("La división de los números es: " + división);
    
        // We close the Scanner
        reader.close();

		

	}

}
