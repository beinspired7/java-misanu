package LoopStructuresDoWhileWhileLoop_08;
//@author Milica Jaric

import java.util.Scanner;

public class Task163_WhileLoop24 {
	/*
	 * Write a program that calculates the value of the sum
	 * 
	 * 𝑆 = 1! + 2! + ... + 𝑛!.
	 * 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum, factorial;
		factorial = 1;
		sum = 0;
		System.out.println("Enter the value of n:");
		int n = input.nextInt();
		int i = 1;
		while (i <= n) {
			factorial *= i;
			sum += factorial;
			i++;
		}
		System.out.println("Factorial of n = " + factorial);
		System.out.println("Sum = " + sum);
	}

}
