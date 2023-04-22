package TwoDimensionalArrays_11;

import java.util.Scanner;

// @author Milica Jaric

public class Task223_DDN02 {
	/*
	 * Read the elements of a two-dimensional array and then print all the elements
	 * of the two-dimensional array.
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

		// b) Print all elements of the two-dimensional array

		System.out.println("Array elements are: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
