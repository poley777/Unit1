package unit1;

import java.util.Scanner;

import java.util.Locale;

public class Exercise12 {

	public static void main(String[] args) {
	
	//We created a new Scanner to read from the user
	Scanner reader =new Scanner(System.in);
	
	//We declare a variable for the pera
	double pera;
	
	//We declare a variable for the apple
	double manzana;
	
	//We declare a variable for the price of pera
	double preciopera;
	
	//We declare a variable for the price of apple
	double preciomanzana;
	
	//We declare a variable for the total import
	double importetotal;
	
	//We request the number of pera
	System.out.println("Introduzca la cantidad de pera vendidas en kilos:");
	pera = reader.nextDouble();
	//We calculate the import of pera
	preciopera = pera*1.95;
	
	//We request the number of apple
	System.out.println("Introduzca la cantidad de manzana vendidas en kilos:");
	manzana = reader.nextDouble();
	
	//We calculate the import of apple
	preciomanzana = manzana*2.35;
	
	//We calculate the total import
	importetotal = preciopera+preciomanzana;
	
	//We show the total import
	System.out.println("El importe total en ventas es: " + importetotal +" euros");
	

	}

}
