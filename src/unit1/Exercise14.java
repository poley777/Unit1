package unit1;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
	
	//We create a Scanner to read from the user
	Scanner reader =new Scanner(System.in);
		
	//We declare a variable for the first quarter notes
	int notaPrimerTrimestre;
		
	//We declare a variable for the second quarter notes
	int notaSegundoTrimestre;
		
	//We declare a variable for the third quarter notes
	int notaTercerTrimestre;
	
	//We declare a variable for the average note in report card
	int notaMediaBoletin;
	
	//We declare a variable for the average note in academic record
	double notaMediaExpediente;
	
	//We asked if it was raining
	System.out.println("Introduzca nota primer trimestre");
	notaPrimerTrimestre = reader.nextInt();
		
	//We asked if it have completed the tasks
	System.out.println("Introduzca nota segundo trimestre");
	notaSegundoTrimestre = reader.nextInt();
		
	//We asked if he had to go to the library
	System.out.println("Introduzca nota tercer trimestre");
	notaTercerTrimestre = reader.nextInt();
	
	//We calculate the average note in academic record
	notaMediaExpediente = (double) ((notaPrimerTrimestre + notaSegundoTrimestre + notaTercerTrimestre))/3;
	
	//We calculate the average note in average note in report card
	notaMediaBoletin = (int) notaMediaExpediente;
	
	//We show the average note in report card and academic record
	System.out.println("La nota media: En el boletín de calificaciones es:" + notaMediaBoletin);
	
	//We show the average note in report card and academic record
	System.out.println("La nota media: En el expediente académico es:" + notaMediaExpediente);
	
	//We close the Scanner
	reader.close();
		

	}

}
