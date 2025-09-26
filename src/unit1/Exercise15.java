package unit1;

import java.util.Scanner;
public class Exercise15 {

	public static void main(String[] args) {
	
	//We create a Scanner to read from the user
	Scanner reader = new Scanner(System.in);
	
	//We declare a variable for the IVA
	final int IVA = 21;
	
	//We declare a variable for the prize
	double precio;
	
	//We declare a variable for prize with IVA
	double precioconIVA;
	
	//We request the prize
	System.out.println("Introduzca el precio:");
	precio = reader.nextDouble();
	
	//We calculate the prize with IVA
	precioconIVA = precio + precio*IVA/100;
	System.out.println("El precio con IVA es:" + precioconIVA);
	
	//We close the Scanner
	reader.close();
	
		

	}

}
