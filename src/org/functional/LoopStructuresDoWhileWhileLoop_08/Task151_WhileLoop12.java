package org.functional.LoopStructuresDoWhileWhileLoop_08;

import java.util.Scanner;

//@author Milica Jaric

public class Task151_WhileLoop12 {
	/*
	 * Write a program that calculates the value of the sum
	 * 
	 * S = 2 / k + 2 / (k+1) + 2 / (k+2) + ... + 2 / (k + n)
	 * 
	 * for the entered value of n. Solve the task using:
	 * 
	 * a) do-while loop b) while loop
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, k;
		double sum = 0;
		System.out.print("Enter the value of n: ");
		n = input.nextInt();
		System.out.print("Enter the value of k: ");
		k = input.nextInt();
		int i = 0;
		do {
			sum = sum + 2 / (double) (k + i);
			++i;
		} while (i <= n);
		System.out.println("(do-while) The sum is " + sum);

		// Solution with while loop
		while (i <= n) {
			sum = sum + 2 / (double) (k + i);
			++i;
		}

		System.out.println("(while) The sum is " + sum);
	}

}
