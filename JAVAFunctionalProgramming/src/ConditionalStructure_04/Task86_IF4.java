package ConditionalStructure_04;
//@author Milica Jaric

import java.util.Scanner;

public class Task86_IF4 {
	/*
	 * Write a program that determines whether the entered character is a lowercase
	 * or uppercase letter, a digit or a special character. Output results:
	 * 
	 * Enter a character: ( The entered character is a special character.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		char x;

		/* Input data */
		System.out.println("Enter x: ");
		x = input.next().charAt(0);

		/* Data processing */

		if (x >= 'a' && x <= 'z')
			System.out.println("The entered character " + x + " is a lowercase letter.");
		else if (x >= 'A' && x <= 'Z')
			System.out.println("The entered character " + x + " is an uppercase letter.");
		else if (x >= '0' && x <= '9')
			System.out.println("The entered character " + x + " is a digit.");

		else
			System.out.println("The entered character " + x + " is a special character.");

		input.close();
	}

}
