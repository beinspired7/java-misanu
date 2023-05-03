package org.functional.ConditionalStructureIfElse_04;
//@author Milica Jaric

import java.util.Scanner;

public class Task85_IF3 {
	/*
	 * Write a program that checks whether the entered number is even
	 */
	public static void main(String[] args) {
		/* Check whether the number is even. */
		int number;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number: ");
		number = input.nextInt();

		/* Conditional structure */
		if (number == 0) {
			System.out.println("You entered 0.");
		} else if (number % 2 == 0)
			System.out.println("The number is even.");
		else
			System.out.println("The number is odd.");
		input.close();
	}

}
