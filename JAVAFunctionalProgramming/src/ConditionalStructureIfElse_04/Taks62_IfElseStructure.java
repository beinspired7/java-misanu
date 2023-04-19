package ConditionalStructureIfElse_04;
// @author Milica Jaric

import java.util.Scanner;

/*
 * Write an algorithm and program that calculates the value of the function shown in the image. Print the result in the format "For X = xxx.xxx, Y = xxx.xxx".
 */
public class Taks62_IfElseStructure {

	public static void main(String[] args) {

		// Declare variables
		double x, y;

		// Input: Read input value
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x: ");
		x = input.nextDouble();

		// Calculation
		if (x >= 0)
			y = x;
		else
			y = -x;

		// Alternative: Use ternary operator
		// y = (x >= 0) ? x : -x;

		// Output
		System.out.println("For X = " + x + ", Y = " + y);

	}

}
