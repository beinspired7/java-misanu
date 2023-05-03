package org.functional.LoopStructures_07;

import java.util.Scanner;

//@author Milica Jaric

public class Task171_WhileLoop32 {
	/*
	 * Write a program that reads numbers that are greater than 10 and less than 30.
	 * Find the arithmetic mean of the entered numbers.
	 * 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value for a:");
		int a = input.nextInt();
		int sum = 0, count = 0;
		while (a > 10 && a < 30) {
			sum += a;
			count++;
			System.out.println("Enter a value for a:");
			a = input.nextInt();
		}
		if (count != 0) {
			double mean = (double) sum / count;
			System.out.println("The arithmetic mean is " + mean);
		} else {
			System.out.println("You did not enter any numbers in the required range.");
		}
	}

}
