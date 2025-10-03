package EnglishExercisesPart2;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {

		// Create a Scanner to read input from the user
        Scanner sc = new Scanner(System.in);

        // Declare variables for length, height, area, and perimeter
        double length;
        double height;
        double area;
        double perimeter;

        // Ask the user to enter the length
        System.out.println("Enter the length value :");
        length = sc.nextDouble();

        // Ask the user to enter the height
        System.out.println("Enter the height value :");
        height = sc.nextDouble();

        // Calculate the area of the rectangle
        area = length * height;

        // Calculate the perimeter of the rectangle
        perimeter = length * 2 + height * 2;

        // Print the area
        System.out.println("The area is : " + area);

        // Print the perimeter
        System.out.println("The perimeter is : " + perimeter);

        // Close the Scanner to free resources
        sc.close();
	}

}
