package Part2;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		//We create a Scanner
		Scanner reader = new Scanner(System.in);
		
		//We create a variables for the distances
		double primeraDistanciaMilimetros;
		double primeraDistanciaCentimetros;
		double segundaDistanciaCentimetros;
		double terceraDistanciaMetros;
		double terceraDistanciaCentimetros;
		double distanciaTotal;
		
		//We ask the user three distances
		System.out.println("Introduce una distancia en milímetros, otra en centímetros y la última en metros");
		primeraDistanciaMilimetros = reader.nextDouble();
		segundaDistanciaCentimetros = reader.nextDouble();
		terceraDistanciaMetros = reader.nextDouble();
		
		//We do the conversion of the three distances to centimeters
		primeraDistanciaCentimetros = primeraDistanciaMilimetros/10;
		terceraDistanciaCentimetros = terceraDistanciaMetros*100;
		
		//We calculate the total distance
		distanciaTotal = primeraDistanciaCentimetros + segundaDistanciaCentimetros + terceraDistanciaCentimetros;
		
		//We show the total distance
		System.out.println("La distancia total es: " + distanciaTotal);
		
		//We close the Scanner
		reader.close();

	}

}
