package org.functional.Methods_12;
//@author Milica Jaric

public class Task264_Methods11 {

	// Create an algorithm and write a program for recursively solving the Towers of
	// Hanoi problem.

	public class Metode10 { // Defining the recursive function
		public static void hanoj(char a, char b, char c, int n) {
			if (n > 0) {
				hanoj(a, c, b, n - 1);
				System.out.println(a + " -> " + b);
				hanoj(c, b, a, n - 1);
			}
		}

		public static void main(String[] args) {
			hanoj('A', 'B', 'C', 4); // For the case of 4 disks.
		}
	}
}
