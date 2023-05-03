package org.functional.TwoDimensionalArrays_11;

import java.util.Scanner;

//@author Milica Jaric

public class Task253_DDN32 {
	/*
	 * Load a two-dimensional array - matrix nxm. Calculate and print a) arithmetic
	 * mean of even elements in columns
	 */
	public static void main(String[] args) {
		// Load a two-dimensional array - matrix 5x5. Calculate and print
		// a) arithmetic mean of even elements in columns
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows: ");
		int rows = sc.nextInt();

		System.out.println("Enter number of columns: ");
		int columns = sc.nextInt();

		// "Matrix" = name of our two-dimensional array
		int array[][] = new int[rows][columns];

		System.out.println("Enter elements: ");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println("array[" + i + "," + j + "]" + "= ");
				array[i][j] = sc.nextInt();
			}
		}
		// Printing the array
		int counter = 0;
		double sum = 0d;
		double avg = 0d;
		System.out.println("\nArray looks like this: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < rows; i++) {
			sum = 0;
			avg = 0;
			System.out.println("Arithmetic mean of even elements in column " + (i + 1) + " is: ");
			for (int j = 0; j < columns; j++) {

				if (array[j][i] % 2 == 0) {
					sum += array[j][i];
					avg = sum / ++counter;
				}
			}
			counter = 0;
			System.out.println(avg);
			System.out.println();
		}

		sc.close();
	}

}
