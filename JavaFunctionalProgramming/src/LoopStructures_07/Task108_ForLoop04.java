package LoopStructures_07;
//@author Milica Jaric

import java.util.Scanner;

public class Task108_ForLoop04 {
	/*
	 * Write a program that adds a given number of addends.
	 * 
	 */
	public static void main(String[] args) {
		// 4. Write a program that adds a given number of addends.

		// Declaration of variables
		double a, b, sum = 0d;

		Scanner input = new Scanner(System.in);

		// 1. Input data
		System.out.println("Enter the first number: ");
		a = input.nextDouble();
		System.out.println("Enter the last number: ");
		b = input.nextDouble();

		// 2. Data processing using a for loop
		for (double i = a; i <= b; i++) {
			System.out.println("Enter " + i + ". number: ");
			double j = input.nextDouble();
			sum += j;
		}
		System.out.println("The sum of these numbers is " + sum);
		input.close(); // Closing the scanner to avoid "resource leak"
	}

}
