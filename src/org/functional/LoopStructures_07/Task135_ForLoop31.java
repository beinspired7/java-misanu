package org.functional.LoopStructures_07;
//@author Milica Jaric

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task135_ForLoop31 {
	/*
	 * Write an algorithm and a program that reads n integers, and then calculates
	 * and prints the sum of all positive and negative integers entered.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// Initializing data about the sums of positive and negative integers
		int sp = 0, sn = 0;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		// Inputting data about integers
		System.out.println("Enter a value for n: ");
		int n = Integer.parseInt(input.readLine());
		System.out.println("Enter integers: ");
		for (int i = 1; i <= n; i++) {
			// Inputting integers
			System.out.println(i + ". number");
			int m = Integer.parseInt(input.readLine());
			// Calculating the sum
			if (m > 0)
				sp += m;
			else
				sn += m;
		}
		// Printing the result
		System.out.println("The sum of positive numbers is " + sp + " and negative numbers is " + sn);
	}
}
