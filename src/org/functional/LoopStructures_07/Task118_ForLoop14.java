package org.functional.LoopStructures_07;
//@author Milica Jaric

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task118_ForLoop14 {
	/*
	 * Write a program to calculate the arithmetic mean of even numbers.
	 */
	public static void main(String[] args) {
		// Variable declaration
		double denominator = 0d, numerator = 0d;

		DecimalFormat df = new DecimalFormat("#.##");
		Scanner input = new Scanner(System.in);

		// 1. Input data
		System.out.println("How many numbers do you want to enter? ");
		denominator = input.nextDouble();

		// 2. Data processing using for loop
		for (int i = 1; i <= denominator; i++) {
			System.out.println("Enter " + i + ". number: ");
			double j = input.nextDouble();
			if (j % 2 == 0) {
				numerator += j;
			}
		}

		// Print the output result
		System.out.println("The arithmetic mean of even numbers is " + df.format((numerator / denominator)));
		input.close(); // Close the scanner to avoid data leakage
	}

}
