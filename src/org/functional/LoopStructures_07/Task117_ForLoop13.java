package org.functional.LoopStructures_07;
//@author Milica Jaric

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task117_ForLoop13 {
	/*
	 * Write a program to calculate the arithmetic mean of entered numbers.
	
	 */
	public static void main(String[] args) {
		// Variable declaration
		double denominator, numerator = 0d;

		DecimalFormat df = new DecimalFormat("#.##");
		Scanner input = new Scanner(System.in);

		// 1. Input data
		System.out.println("How many digits do you want to enter? ");
		denominator = input.nextDouble();

		// 2. Data processing using for loop
		for (int i = 1; i <= denominator; i++) {
			System.out.println("Enter the " + i + ". digit: ");
			double j = input.nextDouble();
			numerator += j;
		}

		// Printing the output result
		System.out.println("The arithmetic mean is " + df.format((numerator / denominator)));
		input.close(); // Closing the scanner to avoid "data leak"
	}

}
