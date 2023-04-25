package TwoDimensionalArrays_11;

import java.util.Scanner;

//@author Milica Jaric

public class Task227_DDN06 {
	/*
	 * Load elements of a two-dimensional array and then print odd elements of the
	 * array. sc.close();
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

		// b) Print odd elements of the array

		System.out.println("Odd elements of the array are: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (array[i][j] % 2 != 0) {
					System.out.print(array[i][j] + " ");
				}
			}
		}
	}

}
