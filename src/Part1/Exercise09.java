package Part1;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		
		// We create a Scanner to read from the user
		Scanner reader =new Scanner(System.in);
		
		//We declare variable for the age
		int edad;
		boolean esmayordeedad;
		
		// We request the age
		System.out.print("Introduzca su edad: ");
		edad = reader.nextInt();
		
		//We reading the number
		esmayordeedad= edad >=18;
		
		// We request the age
		System.out.print("¿Es mayor de edad?: " + esmayordeedad);
		
	       
		// We close the Scanner
		reader.close();
	}

}
