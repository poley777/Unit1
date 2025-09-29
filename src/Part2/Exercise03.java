package Part2;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
	
		//We create a new Scanner
		Scanner reader = new Scanner(System.in);
		
		//We declare a variable for the numbers
		int numeroUno;
		int numeroDos;
		
		//We request the number
		System.out.println("Introduzca dos numeros");
		numeroUno = reader.nextInt();
		numeroDos = reader.nextInt();
		
		//We declare a variable for the rest
		double resto;
		
		//We calculate the rest of the number
		resto = numeroUno % numeroDos;
		
		//We declare a variable for the sum
		int suma;
		
		//We calculate how much we have to add to get to the next multiple of 7
		suma = (int)((resto == 0)? 0:numeroDos-resto);
		
		//We show the result
		System.out.println("Se tiene que sumar " + suma + " para que sea multiplo de " + numeroDos);
		
		//We close the Scanner
		reader.close();

	}

}
