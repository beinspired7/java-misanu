package org.functional.LoopStructures_07;

import java.util.Scanner;

//@author Milica Jaric

public class Task174_WhileLoop35 {
	/*
	 * Write a program that reads an integer n (n > 0) and prints the sum of its
	 * digits.
	 * 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// n - number entered
		// s - sum of digits
		// digit - digit being extracted
		int n, s = 0, digit;
		System.out.println("Enter the value of n:");
		n = input.nextInt();
		if (n < 0)
			System.out.println("You entered a negative number.");
		else {
			while (n > 0) {
				digit = n % 10;
				s += digit;
				n /= 10;
			}
			System.out.println("The sum of digits is " + s);
		}

	}
}