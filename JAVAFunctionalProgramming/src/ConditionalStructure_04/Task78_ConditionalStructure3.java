package ConditionalStructure_04;
//@author Milica Jaric

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Task78_ConditionalStructure3 {
	/*
	 * Write a program that calculates the value of the function shown in the image
	 * based on the entered values of variables x, y, and z, where 2x ≠ y. Print the
	 * value of the function on the output.
	 * 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// Declare variables
		double x, y, z, f;
		DecimalFormat df = new DecimalFormat("#.##");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		// Input values
		System.out.print("Enter a value for x: ");
		x = Double.parseDouble(input.readLine());
		System.out.print("Enter a value for y: ");
		y = Double.parseDouble(input.readLine());
		System.out.print("Enter a value for z: ");
		z = Double.parseDouble(input.readLine());

		if (2 * x != y) {
			// Calculate the value of the function f
			f = (x + y) * (x + z) / (2 * x - y);
			// Print the result
			System.out.println("The value of the function f is " + df.format(f));
		} else {
			// Print an error message to the user about incorrect input
			System.out.println("The input is not valid (y must be different from 2x).");
		}
	}
}
