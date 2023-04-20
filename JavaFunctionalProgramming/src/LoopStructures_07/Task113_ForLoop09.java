package LoopStructures_07;
//@author Milica Jaric

public class Task113_ForLoop09 {
	/*
	 * Check all even numbers in the range from 1 to 100.
	 * 
	 */
	public static void main(String[] args) {
		// 9. Check all even numbers in the range from 1 to 100.

		// Declaration of variables

		// First way
		System.out.println("First way: ");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println("\n\nSecond way: ");
		// Second way
		for (int i = 2; i <= 100; i += 2) {

			System.out.print(i + " ");
		}

	}
}
