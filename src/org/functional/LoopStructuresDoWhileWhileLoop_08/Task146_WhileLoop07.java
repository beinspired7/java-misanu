package org.functional.LoopStructuresDoWhileWhileLoop_08;

import java.util.Scanner;

//@author Milica Jaric

public class Task146_WhileLoop07 {
	/*
	 * Write a program to print the sum of numbers in the range from 1 to the given
	 * number n, whose unit digit is 8.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, i = 1, sum = 0;
		System.out.println("Enter a value for n: ");
		n = input.nextInt();
		while (i <= n) {
			if (i % 10 == 8)
				sum += i;
			i++;
		}
		System.out.println("Sum is " + sum);
	}

}
