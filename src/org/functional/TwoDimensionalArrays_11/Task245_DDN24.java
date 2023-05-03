package org.functional.TwoDimensionalArrays_11;

import java.util.Scanner;

//@author Milica Jaric

public class Task245_DDN24 {
	/*
	 * Print a two-dimensional array and calculate the sum of squares of all its
	 * elements.
	 * 
	 * (Prevent negative input for rows and columns)
	 * 
	 */
	public static void main(String[] args) {

		// Declaration of variables
		double s = 0d;
		int row, column;
		// Data input
		Scanner sc = new Scanner(System.in);

		// Check if a negative number of rows is entered
		do {
			System.out.println("Enter the number of rows: ");
			row = sc.nextInt();
			if (row <= 0) {
				System.out.println("You have entered a negative number of columns!");
			}
		} while (row <= 0);

		// Check if a negative number of columns is entered
		do {
			System.out.println("Enter the number of columns: ");
			column = sc.nextInt();
			if (column <= 0) {
				System.out.println("You have entered a negative number of columns!");
			}
		} while (column <= 0);

		// "Matrix" = the name of our two-dimensional array
		int matrix[][] = new int[row][column];

		System.out.println("Enter elements: ");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println("matrix[" + i + "," + j + "]" + "= ");
				matrix[i][j] = sc.nextInt();

				if (i == j)
					s += Math.pow(matrix[i][j], 2);
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("The sum of squares of all (positive) elements on the main diagonal of the array is: " + s);

		sc.close();

	}

}
