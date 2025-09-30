package Part2;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		
			//We create a Scanner
	     	Scanner reader = new Scanner(System.in);
	     	
	     	//We declare a variable for the id and the volume
	     	int id;
	     	int volumen;
	     	
	     	//We request the id of the problem
	        System.out.print("Introduce el identificador del problema: ");
	        id = reader.nextInt();

	        //We calculate the volume
	        volumen = ((id - 100) / 100) + 1;
	        
	        //We show the result
	        System.out.println("El problema con identificador " + id + " está en el volumen " + volumen + ".");

	        //We close the Scanner
	        reader.close();
		   
	}

}
