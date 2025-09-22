package unit1;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
			//We created a new scanner
			Scanner reader = new Scanner(System.in);
			//We declare the variable number
			double numero;
					
			//Displays the message with carriage return
			System.out.println("Introduzca un número:");

			//The console waits for us to enter a decimal value
			numero = reader.nextDouble();
			
			//We print the value by console
			System.out.println("Ha escrito:" + numero);
			 
			//We close the Scanner
			reader.close();
	}

}
