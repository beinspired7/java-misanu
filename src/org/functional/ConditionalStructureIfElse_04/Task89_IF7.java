package org.functional.ConditionalStructureIfElse_04;

import java.util.Scanner;

//@author Milica Jaric

public class Task89_IF7 {
	/*
	 * Write a conditional statement that calculates y for a given x according to
	 * the following formula:
	 */
	public static void main(String[] args) {
		/* Variable declaration */ double x, y;
		Scanner sc = new Scanner(System.in);

		/* Input data for x */ System.out.println("Enter a value for x: ");
		x = sc.nextDouble();

		/* Conditional statement */
		if (x > -2 && x <= 2) {
			y = 2 * x;
		} else if (x >= 5 && x < 7) {
			y = 3 * -1;
		} else {
			y = 1 / x;
		}

		// Print output
		System.out.println("The value of y is " + y);
		sc.close();
	}

}
