package LoopStructures_07;
//@author Milica Jaric

public class Task116_ForLoop12 {
	/*
	 * Write a program that counts the numbers from 1 to 20 that are divisible by 3.
	 * 
	 */
	public static void main(String[] args) {
		// Write a program that counts the numbers from 1 to 20 that are divisible by 3.
		int count = 0;
		// Input data
		for (int i = 1; i <= 20; i++) {
			if (i % 3 == 0) {
				count++;
			}
		}
		System.out.println("There are " + count + " numbers divisible by 3 between 1 and 20.");

	}

}
