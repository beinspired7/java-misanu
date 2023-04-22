package TwoDimensionalArrays_11;

import java.util.Scanner;

//@author Milica Jaric

public class Task248_DDN27 {
	/*
	 * Load a two-dimensional array - matrix nxm. Calculate and print the sum of all
	 * elements greater than 3.

	 */
	public static void main(String[] args) {
		// Load a two-dimensional array - matrix 5x5. Calculate and print
		// the sum of all elements greater than 3
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();

		System.out.println("Enter the number of columns: ");
		int cols = sc.nextInt();

		// "Matrix" = name of our two-dimensional array
		int array[][] = new int[rows][cols];

		System.out.println("Enter elements: ");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println("array[" + i + "," + j + "]" + "= ");
				array[i][j] = sc.nextInt();
			}
		}
		// Printing the array
		System.out.println("\nArray layout: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		double s = 0d;
		System.out.print("Elements greater than 3. is: " + " ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (array[i][j] > 3) {
					System.out.print(array[i][j] + ", ");
					s += array[i][j];
				}
			}
			System.out.print("");
		}

		System.out.println("\nSum: " + s);

		sc.close();
	}
}
