package LoopStructuresDoWhileWhileLoop_08;

import java.util.Scanner;

//@author Milica Jaric

public class Task164_WhileLoop25 {
	/*
	 * Write a program that calculates the sum of factorials of even numbers up to
	 * n:
	 * 
	 * 𝑆 = 2! + 4! + 6! + ... + 𝑛!.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value for n:");
		int n = input.nextInt();
		int factorial = 1, sum = 0;
		int i = 1;
		while (i <= n) {
			factorial *= i;
			if (i % 2 == 0)
				sum += factorial;
			i++;
		}
		System.out.println("Sum s = " + sum);
	}

}
