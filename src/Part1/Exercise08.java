package Part1;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		
		// We create a Scanner to read from the user
		Scanner reader =new Scanner(System.in);
				
		//We declare variable for the name
		String nombre;
							
		//We declare variable for the age
		int edad;
			
		// We request the name
		System.out.print("Introduzca su nombre: ");
		nombre = reader.nextLine();
		        
		// We request the age
		System.out.print("Introduzca su edad: ");	
		edad = reader.nextInt();
		        
		// We show the results
		System.out.println("Hola, " + nombre + " tienes " + edad + " ¡qué mayor eres!");
		       
		// We close the Scanner
		reader.close();
			}

		}

	