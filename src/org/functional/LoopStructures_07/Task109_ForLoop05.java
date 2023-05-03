package org.functional.LoopStructures_07;
//@author Milica Jaric

public class Task109_ForLoop05 {
	/*
	 * Write a sequence of commands that calculates the squares of natural numbers
	 * from 15 to 25.
	 */
	public static void main(String[] args) {
		// Declare variables
		int i;

		// Data processing
		for (i = 15; i <= 26; i++) {
			System.out.println("Square of number " + i + " is " + (int) (Math.pow(i, 2)));
		}

	}
}