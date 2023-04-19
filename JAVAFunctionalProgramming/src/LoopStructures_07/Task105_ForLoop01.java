package LoopStructures_07;
//@author Milica Jaric

public class Task105_ForLoop01 {
	/*
	 * Write a program that prints all digits.
	 */
	public static void main(String[] args) {
		int i;

		System.out.println("1st way: ");
		for (i = 0; i <= 9; i++) {
			System.out.println(i);
		}

		System.out.println("\n2nd way: ");

		for (int c = 9; c >= 0; c--) {
			System.out.println(c);
		}

	}
}