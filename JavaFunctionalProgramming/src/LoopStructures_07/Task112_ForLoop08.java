package LoopStructures_07;
//@author Milica Jaric

public class Task112_ForLoop08 {
	/*
	 * Using a for loop, print capital letters of the alphabet.
	 */
	public static void main(String[] args) {
		// Using a for loop, print capital letters of the alphabet

		// Input data
		char letter = 'A';
		// Data processing
		for (int i = 1; i <= 26; i++) {

			if (letter >= 'A' && letter <= 'Z') {
				System.out.println(letter);
				letter++;
			}
		}

	}
}
