package ConditionalStructure_04;

import java.util.Scanner;

//@author Milica Jaric

public class Task82_IF0 {
	/*
	 * Write a program that compares and outputs which of the two entered numbers, x
	 * and y, is greater
	 */
	public static void main(String[] args) {
		// Variable declaration
		int x, y;

		// Part 1: Data input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value for x: ");
		x = input.nextInt();
		System.out.println("Enter a value for y: ");
		y = input.nextInt();

		// Part 2: Data processing
		if (x > y)
			System.out.println("X(" + x + ") is greater than Y(" + y + ").");
		else {
			System.out.println("X(" + x + ") is less than Y(" + y + ").");
		}

		input.close();
	}

}
