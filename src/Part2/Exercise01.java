package Part2;

import java.util.Scanner;

import java.util.Locale;

public class Exercise01 {

	public static void main(String[] args) {

		//We create a new Scanner
		Scanner reader = new Scanner(System.in);
		
		//We declare a variables
		double numero;
		double parteDecimal;
		int resultado;
		int parteEntera;
		
		//We request the number 
		System.out.println("Dime un numero con decimales");
		numero = reader.nextDouble();
		
		//We calculate the whole part
		parteEntera = (int) numero; 
		
		//We calculate the decimal part
		parteDecimal = numero - parteEntera;
		
		//We round the number
		resultado = (parteDecimal >= 0.5)? parteEntera+1:parteEntera;
		
		//We show the number
		System.out.println("El numero redondeado es:" + resultado);
		
		//We close the Scanner
		reader.close();
		
	}

}
