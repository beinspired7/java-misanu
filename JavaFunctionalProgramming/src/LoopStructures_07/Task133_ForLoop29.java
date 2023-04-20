package LoopStructures_07;
//@author Milica Jaric

public class Task133_ForLoop29 {
	/*
	 * Write an algorithm and program to print all three-digit numbers that are
	 * divisible by both 2 and 3.
	 */
	public static void main(String[] args) {

		// Processing data
		for (int i = 100; i < 1000; i++) {
			if (i % 2 == 0 && i % 3 == 0) {
				System.out.println(i);

			}
		}

	}
}
