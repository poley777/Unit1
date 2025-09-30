package Part2;

import java.util.Scanner;

import java.util.Locale;

public class Exercise08 {

	public static void main(String[] args) {
	
		//We create a Scanner
		Scanner reader = new Scanner(System.in);
		
		//We declare a variable for the characteristics
		double longitudMetros;
		int longitudCentimetros;
		
		//We ask the lenght of the launch
		System.out.println("Introduzca la longitud del lanzamiento en metros");
		longitudMetros = reader.nextDouble();
	
		//We calculate the whole part of the lenght
		longitudCentimetros = (int)(longitudMetros*100);
		
		//We show the result
		System.out.println("La longitud del lanzamiento es: " + longitudCentimetros);
		
		//We close the Scanner
		reader.close();

	}

}
