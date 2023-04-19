package LinearStructures;

import java.util.Scanner;

/*
 * Create an algorithm and write a program that calculates and prints the sum and difference of the values ​​of the functions f and g, given as shown in the image, based on the entered values ​​of the variables a, b, and c.
 */
public class LinearStructure11 {

	public static void main(String[] args) {

		double a, b, c, f, g;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		a = input.nextDouble();
		System.out.println("Enter the value of b: ");
		b = input.nextDouble();
		System.out.println("Enter the value of c: ");
		c = input.nextDouble();

		f = (a - b) / (c + a / (c + b / (c - b)));
		g = (a + b + Math.sin(a)) * Math.cos(c);

		System.out.println("The sum of f and g is: " + (f + g));
		System.out.println("The difference of f and g is: " + (f - g));

		input.close();
	}
}
