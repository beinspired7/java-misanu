package org.functional.LoopStructuresDoWhileWhileLoop_08;

import java.util.Scanner;

//@author Milica Jaric

public class Task165_WhileLoop26 {
	/*
	 * Write a program that calculates the sum of factorials of multiples of 3 up to
	 * 3n:
	 * 
	 * 𝑆 = 3! + 6! + 9! + ... + (3𝑛)!.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Enter a value for n:");
        Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int factorial = 1, sum = 0;
		int i = 1;
		while (i <= 3 * n) {
			factorial *= i;
			if (i % 3 == 0)
				sum += factorial;
			i++;
		}
		System.out.println("Sum s = " + sum);
	}

}
