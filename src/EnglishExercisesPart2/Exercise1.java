package EnglishExercisesPart2;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
	//We create a Scanner 
	 Scanner reader = new Scanner(System.in);
	 
	 //We declare a variable for the price and tax
	 double price;
	 double tax;
	 
	 //We display a program title and prompt for the price
	 System.out.println("AGENCIA TRIBUTARIA");
	 System.out.println("Introduce the price:");
	 price = reader.nextDouble();
	 
	 //We display a prompt for the tax
	 System.out.println("Introduce the tax:");
	 tax = reader.nextDouble();
	 
	 //We calculate the price
	 price = price * (1 + tax/100);
	 
	 //We show the new price
	 System.out.println("The new price is: " + price);
	 
	 //We close the Scanner
	 reader.close();
	 
	 
	 
	 

	}

}
