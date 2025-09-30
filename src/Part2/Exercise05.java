package Part2;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		
		//We create a Scanner
		Scanner reader = new Scanner(System.in);
		
		//We declare a variables
		int segundos;
		int minutos;
		int horas;
		
		//We ask the user to enter a number of seconds
		System.out.println("Introduzca una cantidad de segundos");
		segundos = reader.nextInt();
		
		//We calculate the number of minutes and hours
		minutos = segundos/60;
		horas = minutos/60;
		
		//We show the conversions
		System.out.println("El número de horas es: " + horas);
		System.out.println("El número de minutos es: " + minutos);
		System.out.println("El número de segundos es: " + segundos);
		
		//We close the Scanner
		reader.close();

	}

}
