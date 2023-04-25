package TwoDimensionalArrays_11;
// @author Milica Jaric

import java.util.Scanner;

public class Task225_DDN04 {
	/*
	 * Load the elements of a two-dimensional array and then print all the elements
	 * of the second column.
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

		// b) Print the elements of the second column

		System.out.println("Elements of the second column: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (j == 1) {
					System.out.print(array[i][j] + " ");
				}
			}
		}
	}
}
