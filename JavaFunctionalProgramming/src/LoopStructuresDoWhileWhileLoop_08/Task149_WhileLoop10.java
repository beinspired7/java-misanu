package LoopStructuresDoWhileWhileLoop_08;

import java.util.Scanner;

//@author Milica Jaric

public class Task149_WhileLoop10 {
	/*
	 * Write a program to calculate the value of the sum
	 * 
	 * S = 1/2 + 1/4 + 1/6 + ... + 1 / 2n
	 * 
	 * for a given value of n. Solve the task using:
	 * 
	 * a) do-while loop b) while loop
	 * 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		double s = 0;
		System.out.print("Enter the value of n: ");
		n = input.nextInt();
		/*
		 * Solution with While int i = 1;
		 * 
		 * while (i <= n) { s += 1 / (double) (2 * i); i++; }
		 */

		// Solution with For
		for (int i = 1; i <= n; i++)
			s += 1 / (double) (2 * 1);

		System.out.println("n = " + n + " s = " + s);
	}

}
