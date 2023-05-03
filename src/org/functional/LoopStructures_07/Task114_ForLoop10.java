package org.functional.LoopStructures_07;

import java.util.Scanner;

//@author Milica Jaric

public class Task114_ForLoop10 {
	/*
	 * In the given interval, test and print all numbers divisible by 3.
	 */
	public static void main(String[] args) {
		// Test and print all numbers divisible by 3 in the given interval
		// Declaration of variables
		int a, b;

		// Data input
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Enter the first number of the interval range: ");
		a = ulaz.nextInt();
		System.out.println("Enter the last number of the interval range: ");
		b = ulaz.nextInt();
		ulaz.close();

		// Data processing
		for (int i = a; i <= b; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}

		}
	}
}
