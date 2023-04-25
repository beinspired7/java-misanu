package TwoDimensionalArrays_11;

import java.util.Scanner;

//@author Milica Jaric

public class Task242_DDN21 {
	/*
	 * 
	 * Replace rows and columns in the loaded two-dimensional array. Starting
	 * two-dimensional array: 10 20 30 40 50 60 70 80 90 Transposed elements: 10 40
	 * 70 20 50 80 30 60 90
	 * 
	 * 
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Number of rows: ");
		int rows = sc.nextInt();

		System.out.println("Number of columns: ");
		int columns = sc.nextInt();

		int array[][] = new int[rows][columns];

		System.out.println("Elements of the matrix: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println("a[" + i + ", " + j + "]" + " = ");
				array[i][j] = sc.nextInt();
			}
		}

		// 8. Replace the rows and columns of the two-dimensional array.

		int[][] transposedArray = new int[rows][columns];
		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < columns; ++j) {
				transposedArray[j][i] = array[i][j];
			}
		}
		System.out.println("Original two-dimensional array: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {

				System.out.print(array[i][j] + " ");

			}
			System.out.println("");

		}

		System.out.println("Transposed elements: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {

				System.out.print(transposedArray[i][j] + " ");

			}
			System.out.println("");
		}

		sc.close();

	}
}
