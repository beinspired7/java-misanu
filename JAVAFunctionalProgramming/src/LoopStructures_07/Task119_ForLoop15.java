package LoopStructures_07;
//@author Milica Jaric

import java.util.Scanner;

public class Task119_ForLoop15 {
	/*
	 * Write a program that reads 10 numbers and prints how many negative, zero, and
	 * positive numbers there are.
	 * 
	 */
	public static void main(String[] args) {
		// 1. Variable initialization
		int negative = 0, positive = 0, zeros = 0;

		Scanner input = new Scanner(System.in);

		// 2. Data processing using for loop
		for (int i = 1; i <= 10; i++) {
			System.out.println("Enter " + i + ". number: ");
			double j = input.nextDouble();
			if (j == 0) {
				zeros++;
			} else if (j > 0) {
				positive++;
			} else {
				negative++;
			}

		}
		// 3. Print the output result
		System.out.println("Positive numbers: " + positive + "\nNegative numbers: " + negative + "\nZeros: " + zeros);
		input.close();
	}

}
