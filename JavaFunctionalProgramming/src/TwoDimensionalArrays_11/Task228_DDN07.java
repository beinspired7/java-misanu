package TwoDimensionalArrays_11;

import java.util.Scanner;

//@author Milica Jaric

public class Task228_DDN07 {

	/*
	 * Load elements of a two-dimensional array, and then print the elements with
	 * even row indices.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Number of rows: ");
		int row = sc.nextInt();

		System.out.println("Number of columns: ");
		int column = sc.nextInt();

		int array[][] = new int[row][column];

		System.out.println("Elements of the matrix: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println("a[" + i + ", " + j + "]" + " = ");
				array[i][j] = sc.nextInt();
			}
		}

		// c) Print the elements with even row indices

		System.out.println("Elements with even row indices: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if ((i + 1) % 2 == 0) {
					System.out.print(array[i][j] + " ");
				}
			}
		}
	}

}
