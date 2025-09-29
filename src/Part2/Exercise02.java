package Part2;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

		//We create a new Scanner
		Scanner reader = new Scanner(System.in);
	
		//We declare a variable for the number
		int numero;
	
		//We request the number
		System.out.println("Introduzca un numero");
		numero = reader.nextInt();
	
		//We declare a variable for the rest
		double resto;
	
		//We calculate the rest of the number
		resto = numero % 7;
	
		//We declare a variable for the sum
		int suma;
	
		//We calculate how much we have to add to get to the next multiple of 7
		suma = (int)((resto == 0)? 0:7-resto);
	
		//We show the result
		System.out.println("Se tiene que sumar " + suma + " para que sea multiplo de siete");
	
		//We close the Scanner
		reader.close();

	}

}
