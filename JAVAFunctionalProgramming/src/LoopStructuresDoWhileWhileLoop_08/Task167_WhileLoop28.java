package LoopStructuresDoWhileWhileLoop_08;

import java.util.Scanner;

//@author Milica Jaric

public class Task167_WhileLoop28 {
	/*
	 * Write a program that calculates the sum of:
	 * 
	 * 𝑆 = 1/2 - 2/3 + 3/4 + ... + (-1)n+1 * n / (n+1)
	 * 
	 * for given value of n.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Enter a value for n:");
		int n = ulaz.nextInt();
		int sign = 1;
		double s = 0;
		int i = 1;
		while (i <= n) {
			s += sign * i / (double) (i + 1);
			sign = -sign;
			i++;
		}
		System.out.println("Sum s = " + s);
	}

}
