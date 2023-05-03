package org.functional.LoopStructures_07;
//@author Milica Jaric

import java.util.Scanner;

public class Task128_ForLoop24 {
	/*
	 * Write a program that calculates y for n input values of a and b using the
	 * formula below.
	 * 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a, b, y;
		System.out.println("Enter the value for n: ");
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter the value of a: ");
			a = input.nextDouble();
			System.out.println("Enter the value of b: ");
			b = input.nextDouble();
			if (a >= 0)
				y = (1 - Math.min(a, b)) / (1 + Math.max(a, b));
			else
				y = Math.min(a, b) / (Math.min(a * a, b * b) + 3);
			System.out.println("For the entered values of a = " + a + " and b = " + b + ", the value of y = " + y);
		}

	}
}
