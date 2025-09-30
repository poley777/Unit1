package Part2;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		
		 //We create a Scanner
		Scanner reader = new Scanner(System.in);
		
		//We declare a variable for the year and the century
		int año;
		int siglo;
		
		//We request the year
		System.out.println("Introduzca el año");
		año = reader.nextInt();
		
		//We calculate the century
		siglo = (int)(((año-1)/100)+1);
		
		//We show the result 
		System.out.println("El siglo de ese año es el siglo " + siglo);
		
		//We close the Scanner
		reader.close();

	}

}
