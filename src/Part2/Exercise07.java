package Part2;

import java.util.Scanner;

import java.util.Locale;

public class Exercise07 {

	public static void main(String[] args) {
		
		//We create a Scanner
		Scanner reader = new Scanner(System.in);
		
		//We declare a variables for the tickets
		int entradaInfantiles;
		int entradaAdultos;
		double importeTotalBruto;
		double importeTotalNeto;
		double descuento = 00.5;
		      
		//We ask for the number of purchased tickets
		System.out.println("Introduzca el numero de entradas (infantiles y adultos) compradas");
		entradaInfantiles = reader.nextInt();
		entradaAdultos = reader.nextInt();
		
		//We calculate the total amount
		importeTotalBruto = ((double)(entradaInfantiles*15.5) + entradaAdultos*20);
		
		//We apply the discount if necessary
		importeTotalNeto = (importeTotalBruto>=100)? importeTotalBruto: importeTotalBruto-importeTotalBruto*00.5;
		
		//We show the total import
		System.out.println("El importe total es:" + importeTotalNeto);
	
		//We close the Scanner
		reader.close();

	}

}
