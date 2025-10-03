package EnglishExercisesPart2;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		// Create a Scanner
        Scanner sc = new Scanner(System.in);

        // Declare variables
        double kilos;
        double pounds;
        
        System.out.println("Enter the pounds value :");
        pounds= sc.nextDouble();

        // Calculate the area of the rectangle
        kilos = pounds/2.2;

        // Print the pounds
        System.out.println("The kilos is : " + kilos);

        // Close the Scanner to free resources
        sc.close();

	}

}
