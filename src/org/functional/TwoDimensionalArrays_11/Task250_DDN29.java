package org.functional.TwoDimensionalArrays_11;
//@author Milica Jaric

import java.util.Scanner;

public class Task250_DDN29 {

	/*
	 * Load a two-dimensional array - matrix nxm. Calculate and print out a)
	 * arithmetic mean of all elements
	 */
	public static void main(String[] args) {
		// Load a two-dimensional array - matrix 5x5. Calculate and print out
		// a) arithmetic mean of all elements
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();

		System.out.println("Enter the number of columns: ");
		int columns = sc.nextInt();

		// "Matrix" = the name of our two-dimensional array
		int arr[][] = new int[rows][columns];

		System.out.println("Enter the elements: ");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println("matrix[" + i + "," + j + "]" + "= ");
				arr[i][j] = sc.nextInt();
			}
		}
		// Print the array
		int counter = 0;
		double sum = 0d;
		System.out.println("\nArray layout: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(arr[i][j] + " ");
				counter++;
				sum += arr[i][j];
			}
			System.out.println();
		}

		double mean = sum / counter;

		System.out.println("\nArithmetic mean of all elements is: " + mean);

		sc.close();
	}
}
