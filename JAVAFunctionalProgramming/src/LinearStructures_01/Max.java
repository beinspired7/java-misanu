package LinearStructures_01;
//@author Milica Jaric

import java.util.Scanner;

/*
 * 		Write a program that calculates y for the given values of a and b according to the formula y = 5 + max(a2, b2). Print the value of y as output.

 */
public class Max {

	public static void main(String[] args) {
		{

			Scanner input = new Scanner(System.in);

			System.out.println("Enter a value for a: ");
			double a = input.nextDouble();
			System.out.println("Enter a value for b: ");
			double b = input.nextDouble();

			System.out.println("y = " + (5 + Math.max(a * a, b * b)));

		}
	}
}
