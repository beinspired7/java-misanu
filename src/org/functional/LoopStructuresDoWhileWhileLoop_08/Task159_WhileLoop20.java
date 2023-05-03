package org.functional.LoopStructuresDoWhileWhileLoop_08;

import java.util.Scanner;

//@author Milica Jaric

public class Task159_WhileLoop20 {
	/*
	 * Write a program to extract and print each digit of a number one below the
	 * other starting from the unit digit.
	 * 
	 * Explanation: Divide the number by 10 and the remainder obtained is the unit
	 * digit. Then, perform integer division of the number by 10, and repeat the %
	 * command.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		int digit;
		do {
			digit = number % 10; // extracted digit
			number = number / 10; // integer value of the number divided by 10
			System.out.println(digit); // extracted digit
		} while (number > 0);
	}

}
