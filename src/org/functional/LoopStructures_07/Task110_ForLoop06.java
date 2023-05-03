package org.functional.LoopStructures_07;
//@author Milica Jaric

import java.util.Scanner;

public class Task110_ForLoop06 {
	/*
	 * Write commands to calculate the factorial of a natural number n: fact = n! =
	 * 123*...*n.
	 * 
	 */
	public static void main(String[] args) {
		// Declare variables
		int n;
		int factorial = 1;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to calculate its factorial: ");

		// Data input
		n = input.nextInt();

		// Data processing
		for (int i = 2; i <= n; i++) {
			factorial *= i;
		}
		System.out.println("The factorial of " + n + " is " + factorial);
		input.close();
	}

}
