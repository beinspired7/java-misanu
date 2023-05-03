package org.functional.LoopStructures_07;
//@author Milica Jaric

public class Task106_ForLoop02 {
	/*
	 * Write a program that calculates the square and cube of numbers from 1 to 5.
	 */

	public static void main(String[] args) {

		for (int number = 1; number <= 5; number++) {
			System.out.printf("%8d%8d%8d \n", number, number * number, number * number * number);
		}
	}

}
