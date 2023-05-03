package org.functional.ConditionalStructureIfElse_04;

import java.util.Scanner;

//@author Milica Jaric

public class Task87_IF5 {
	/*
	 * Write a program that calculates y for a given x using the following formula:
	 */
	public static void main(String[] args) {
		double x, y;

		// Input
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a value for x: ");

		x = input.nextDouble();

		// Data processing

		if (x < 0) {
			y = 5;

		} else if (x >= 0 && x < 1) {
			y = x + 2;
		} else if (x >= 1 && x < 5) {
			y = 3 * x - 1;
		} else {
			y = 2 * x;
		}

		// Output
		System.out.println("For entered x = " + x + " the value of y is: " + y);

		input.close();
	}

}
