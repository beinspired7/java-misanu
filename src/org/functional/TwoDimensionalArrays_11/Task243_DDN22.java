package org.functional.TwoDimensionalArrays_11;
//@author Milica Jaric

import java.util.Scanner;

public class Task243_DDN22 {
	/*
	 * Load a two-dimensional array and print all elements on and below the main
	 * diagonal.
	 */
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
				if (j <= i) {
					System.out.print(niz[i][j] + " ");
				}

			}
			System.out.println();
		}

		sc.close();
	}

	/*
	 * 
	 * Initial appearance: 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 New
	 * appearance: 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
	 */
}
