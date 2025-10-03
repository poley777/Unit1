package EnglishExercisesPart2;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		//We create a Scanner
		Scanner reader = new Scanner(System.in);
		
		//We declare a variable for the age and the year he was born
		int age;
		int year;

		//We request for the age
		System.out.println("Introduce the age:");
		age = reader.nextInt();
		
		//We calculate the year
		year = (2025 - age);
		
		//We show the year of born
		System.out.println("The year of birth");
		
		//We close the Scanner
		reader.close();
	}

}
