package org.functional.LoopStructures_07;
//@author Milica Jaric

import java.util.Scanner;

public class Task111_ForLoop07 {
	/*
	 * Write a program that calculates:
	 * 
	 * S = n*(n+m)(n+2m)(n+3m)...(n+mm)
	 * 
	 * for given natural numbers m and n.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		/* Input data */
		int n, m, s = 1;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value for n: ");
		n = input.nextInt();
		System.out.println("Enter the value for m: ");
		m = input.nextInt();
		input.close();

		/* Data processing */
		for (int i = 1; i <= m; i++) {
			s *= n + i * m;
		}

		/* Printing the output result for S */
		System.out.println("The value of S is: " + (n * s));
	}

}
