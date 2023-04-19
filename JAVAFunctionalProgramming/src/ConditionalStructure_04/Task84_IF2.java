package ConditionalStructure_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Milica Jaric

public class Task84_IF2 {
	/*
	 * Write a program to check if a given number is divisible by both 2 and 3.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		/* Check if a given number is divisible by both 2 and 3 */

		int number;

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a number: ");

		number = Integer.parseInt(input.readLine());

		if ((number % 2 == 0) && (number % 3 == 0)) {
			System.out.println("The number " + number + " is divisible by both 2 and 3.");
		} else
			System.out.println("The number " + number + " is not divisible by 2 and 3.");
	}

}
