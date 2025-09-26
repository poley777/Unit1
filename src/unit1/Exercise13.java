package unit1;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {
	
	//We create a Scanner to read from the user
	Scanner reader =new Scanner(System.in);
	
	//We declare a variable for the rain
	boolean sillueve;
	
	//We declare a variable for the tasks
	boolean finalizotareas;
	
	//We declare a variable for the library
	boolean irbiblioteca;	

	//We asked if it was raining
	System.out.println("¿Esta lloviendo?");
	sillueve = reader.nextBoolean();
	
	//We asked if it have completed the tasks
	System.out.println("¿Has finalizado las tareas?");
	finalizotareas = reader.nextBoolean();
	
	//We asked if he had to go to the library
	System.out.println("¿Tienes que ir a la biblioteca?");
	irbiblioteca = reader.nextBoolean();
	
	//We declare a variable for go out into the street
	boolean salir;
	
	//We create a algorithm 
	salir =(!sillueve && finalizotareas) || irbiblioteca;
	
	//We give the answer
	System.out.println("¿Puedo salir a la calle?" + salir);
	
	//We close the Scanner
	reader.close();


	
	

	}

}
