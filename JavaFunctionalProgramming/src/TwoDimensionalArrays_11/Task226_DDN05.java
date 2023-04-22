package TwoDimensionalArrays_11;

import java.util.Scanner;

// @author Milica Jaric

public class Task226_DDN05 {
	/*
	 * Load elements of a two-dimensional array and then print all even elements.
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

		// b) Print even elements of the array

		System.out.println("Even elements of the array are: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (array[i][j] % 2 == 0) {
					System.out.print(array[i][j] + " ");
				}
			}
		}
	}
}