package EnglishExercisesPart2;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Declare variables for weight, height, and BMI
        double weight;
        double height;
        double BMI;
        
        // Ask the user to enter their weight in kilograms
        System.out.println("Enter your weight in kilograms: ");
        weight = sc.nextDouble();
        
        // Ask the user to enter their height in meters
        System.out.println("Enter your height in meters: ");
        height = sc.nextDouble();
        
        // Calculate BMI using the formula: weight / (height * height)
        BMI = weight/(height * height);
        
        // Display the calculated BMI to the user
        System.out.println("Your BMI is: " + BMI);
        
        // Close the Scanner object to free system resources
        sc.close();

	}

}
