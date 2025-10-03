package EnglishExercisesPart2;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		// Create Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Declare variables for students, teamSize,teamsFormed, and studentsLeft
        int students;
        int teamSize;
        int teamsFormed;
        int studentsLeft;
        
        
        // Ask for number of students
        System.out.print("Enter the number of students in the group: ");
        students = sc.nextInt();
        
        // Ask for team size
        System.out.print("Enter the size of each team: ");
        teamSize = sc.nextInt();
        
        // Calculate how many teams can be formed
        teamsFormed = students / teamSize;
        
        // Calculate how many students are left without a team
        studentsLeft = students % teamSize;
        
        // Display results
        System.out.println("Number of teams that can be formed: " + teamsFormed);
        System.out.println("Number of students without a team: " + studentsLeft);
        
        // Close Scanner
        sc.close();

	}

}
