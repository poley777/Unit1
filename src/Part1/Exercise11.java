package Part1;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
	
	//We create a Scanner to read from the user
	Scanner reader =new Scanner(System.in);
	
	//We declare a variable for the peseta
	double peseta;
	
	//We declare a variable for the euro
	double euro;
	
	// We request the pesetas
    System.out.print("Introduzca las pesetas: ");
    peseta = reader.nextDouble();
    
	// We calculate the conversion
	euro = peseta + 166;
    
    //We show the conversion
    System.out.println("El valor en euro es " + euro);
	


	}

}
