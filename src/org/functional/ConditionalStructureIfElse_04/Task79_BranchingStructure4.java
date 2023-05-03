package org.functional.ConditionalStructureIfElse_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Milica Jaric

public class Task79_BranchingStructure4 {
	/*
	 * Write a program that calculates the value of a function shown in the image
	 * based on the entered value of the variable x, where x >= 1. Print the value
	 * of the function on the output.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// Declare variables
		double x;
		boolean y;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		// Input value for x
		System.out.print("Enter a value for x: ");
		x = Double.parseDouble(input.readLine());
		if (x >= 1) {
			// Calculate the value of function y
			y = Math.sqrt((2 + x - Math.pow(x, 3)) / (x + 2)) > 0 || Math.exp(x) < x - 1 && Math.sqrt(x - 1) <= 0;
			// Print the result
			System.out.println("The value of the function y is " + y);
		} else
			// Print a message to the user about incorrect data input
			System.out.println("The input value for x is invalid (x must be different from 1).");
	}

}
