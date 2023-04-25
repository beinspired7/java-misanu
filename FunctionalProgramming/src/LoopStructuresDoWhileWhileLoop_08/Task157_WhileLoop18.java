package LoopStructuresDoWhileWhileLoop_08;
//@author Milica Jaric

import java.util.Scanner;

public class Task157_WhileLoop18 {
	/*
	 * Write a program that calculates the value of the expression in the image for the entered value of n.
	 * 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		double s = 0;
		System.out.print("Enter a value for n: ");
		n = input.nextInt();
		int i = 1;
		while (i <= n) {
			s += i / Math.pow((2 * i - 1), 2);
			i++;
		}
		System.out.println("The sum is: " + s);
	}

}
