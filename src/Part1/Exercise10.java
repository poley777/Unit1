package Part1;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		
		// We create a Scanner to read from the user
		Scanner reader =new Scanner(System.in);
		
		//We declare variable for the number
		int numero;
		boolean espar;
		
		// We request the age
		System.out.print("Introduzca un numero: ");
		numero = reader.nextInt();

		//We check if the number is even
		espar = numero%2 == 0;
		
		//Imprimimos si el número es par o impar
		System.out.println("¿El número es par?" + (espar ? "Sí" : "No"));
	}
	

}
