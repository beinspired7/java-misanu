package org.functional.TwoDimensionalArrays_11;

import java.util.Scanner;

//@author Milica Jaric

/*
 * Load a two-dimensional array and print all elements above and on the secondary diagonal.
 */
public class Task244_DDN23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Array initialization

		int[][] niz = { { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 } };

		// Printing the initial appearance of the array

		System.out.println("Initial appearance: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}

		// Printing the new appearance of the array
		System.out.println("New appearance: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j >= i) {
					System.out.print(niz[i][j] + " ");
				}

			}
			System.out.println();
		}
	}

}
