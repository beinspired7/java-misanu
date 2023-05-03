package org.functional.LoopStructuresDoWhileWhileLoop_08;

import java.util.Scanner;

//@author Milica Jaric

public class Task155_WhileLoop16 {
	/*
	 * Write a program to calculate the value of the expression for the entered k:
	 * 
	 * 𝑃 = 𝑘 𝑘 + 1 … 2𝑘 − 1 2𝑘.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k;
		double p = 1;
		System.out.println("Enter a value for k: ");
		k = input.nextInt();
		int i = k;
		while (i <= (2 * k))
			p *= i++;
		System.out.println("The product is " + p);
	}

}
