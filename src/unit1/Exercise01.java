package unit1;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		//Creamos un nuevo escaner
		Scanner reader = new Scanner(System.in);
		//Declaramos la variable numero
		double numero;
				
		//Muestra el mensaje con retorno de carro
		System.out.println("Introduzca un número:");

		//La consola se queda esperando a que introduzcamos un valor decimal
		numero = reader.nextDouble();
		
		//Imprimimos el valor por consola
		System.out.println("Ha escrito:" + numero);
		
		//Cerramos el Scanner
		reader.close();
		
	}

}
