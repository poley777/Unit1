package Part2;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
	
		//We create a Scanner
		Scanner reader = new Scanner(System.in);
		
		//We declare a variables for the coefficients
		int a;
		int b;
		int c;
		int y;
		int x;
		
		//We request the variables
		System.out.println("Introduzca los coeficientes a,b,c y el valor de x:");
		a = reader.nextInt();
		b = reader.nextInt();
		c = reader.nextInt();
		x = reader.nextInt();
		
		//We calculate the variable y
		y = (a*x^2+b*x+c);
		
		//We show the result
		System.out.println("La fórmula es: y =" + a +"*("+ x +")^2 +"+ b + "*(" + x + ") + " + c);
		
		//We close the Scanner
		reader.close();

	}

}
