package org.functional.LoopStructures_07;
//@author Milica Jaric

public class Task107_ForLoop03 {
	/*
	 * Write a program to calculate the sum of numbers from 1 to 10.
	 * 
	 */
	public static void main(String[] args) {
		int sum = 0; /* 0 represents the additive identity */
		for (int i = 1; i <= 10; i++) {
			sum = sum + i; // sum += i;

		}
		System.out.println("Sum of numbers is: " + sum);
	}

}
