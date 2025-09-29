package Part1;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// We create a Scanner to read from the user
		Scanner reader =new Scanner(System.in);
		
		//We declare variable for the name
		String nombre;
					
		//We declare variable for the address
		String dirección;
				
		//We declare the variable for the phone
		String teléfono;
		
		// We request the name
        System.out.print("Introduzca su nombre: ");
        nombre = reader.nextLine();
        
        // We request the address
        System.out.print("Introduzca su direccion: ");
        dirección = reader.nextLine();
        
        // We request the phone
        System.out.print("Introduzca su teléfono: ");
        teléfono = reader.nextLine();
        
        // We show the results
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + dirección);
        System.out.println("Teléfono: " + teléfono);
       
        // We close the Scanner
        reader.close();
	}

}
