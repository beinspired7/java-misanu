package TwoDimensionalArrays_11;
//@author Milica Jaric

import java.util.Scanner;

public class Task240_DDN19 {
	/*
	 * /* Load a two-dimensional array and print the elements on the main diagonal.
	 * 
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

		// Array layout
		System.out.println("Array layout: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		// a) Load a two-dimensional array and print the elements on the main diagonal

		System.out.print("Main diagonal: ");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {

				if (i == j) {
					System.out.print(array[i][j] + ", ");
				}
			}
		}
		System.out.println("");
		sc.close();
	}

}
