package org.functional.LoopStructuresDoWhileWhileLoop_08;
//@author Milica Jaric

import java.util.Scanner;

public class Task150_WhileLoop11 {
	/*
	 * Write a program to calculate the value of the sum
	 * 
	 * S = 12 + 32 + 52 + ... +n2
	 * 
	 * for a given value of n. Solve the task using:
	 * 
	 * a) do-while loop b) while loop
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, s = 0;
		System.out.print("Enter the value of n: ");
		n = input.nextInt();
		int i = 1;
		// Solution with Do / While
		do {
			if (i % 2 != 0)
				s += Math.pow(i, 2);
			i++;
		} while (i <= n);

		// Solution with While
		// while (i <= n){ if (i % 2 != 0) s += Math.pow(i, 2); i++; }

		System.out.println("For the entered value of n = " + n + " the result is s = " + s);

	}

}
