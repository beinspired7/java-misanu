package LoopStructures_07;
//@author Milica Jaric

public class Task115_ForLoop11 {
	/*
	 * Write a program that prints Armstrong numbers. A number is Armstrong if it is
	 * equal to the sum of cubes of its digits.
	 */
	public static void main(String[] args) {
		// Write a program that prints Armstrong numbers. A number is Armstrong if it is
		// equal to the sum of cubes of its digits.

		int number, hundreds, tens, ones;

		// Data processing
		for (int i = 100; i < 1000; i++) {

			number = i;
			hundreds = number / 100;
			tens = (number / 10) % 10;
			ones = number % 10;

			if (number == (hundreds * hundreds * hundreds + tens * tens * tens + ones * ones * ones)) {
				System.out.println("The number " + number + " is an Armstrong number.");
			}

		}
	}
}
