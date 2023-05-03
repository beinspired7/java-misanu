package org.functional.TwoDimensionalArrays_11;

import java.util.Scanner;

//@author Milica Jaric

public class Task241_DDN20 {
	/*
	 * Load a two-dimensional array and print the elements on the secondary
	 * diagonal.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Number of rows: ");
		int rows = sc.nextInt();

		System.out.println("Number of columns: ");
		int columns = sc.nextInt();

		int array[][] = new int[rows][columns];

		System.out.println("Array elements: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println("a[" + i + ", " + j + "]" + " = ");
				array[i][j] = sc.nextInt();
			}
		}

		// Display array
		System.out.println("Array A: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		// a) Load a two-dimensional array and print the elements on the SECONDARY
		// diagonal

		System.out.print("Secondary diagonal: ");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {

				if ((i + j) == (rows - 1)) {
					System.out.print(array[i][j] + ", ");
				}
			}
		}
		System.out.println("");
		sc.close();
	}

}
