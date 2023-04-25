package TwoDimensionalArrays_11;

import java.util.Scanner;

//@author Milica Jaric

public class Task224_DDN03 {
	/*
	 * Load the elements of a two-dimensional array and then print all the elements
	 * of the first row.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Number of rows: ");
		int row = sc.nextInt();

		System.out.println("Number of columns: ");
		int column = sc.nextInt();

		int array[][] = new int[row][column];

		System.out.println("Array elements: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println("a[" + i + ", " + j + "]" + " = ");
				array[i][j] = sc.nextInt();
			}
		}

		// b) Print the elements of the first row

		System.out.println("Elements of the first row: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (i == 0) {
					System.out.print(array[i][j] + " ");
				}
			}
		}
	}
}
