package TwoDimensionalArrays_11;

import java.util.Scanner;

//@author Milica Jaric

public class Task247_DDN26 {
	/*
	 * Load a two-dimensional array - matrix nxm. Calculate and print the sum of
	 * elements in the fifth column of the array X[n,m].
	 * 
	 */
	public static void main(String[] args) {
		// Load a two-dimensional array - matrix nxm. Calculate and print the sum
		// of elements in the fifth column of the array X[n,m].
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();

		System.out.println("Enter the number of columns: ");
		int col = sc.nextInt();

		// "Matrix" is the name of our two-dimensional array
		int array[][] = new int[row][col];

		System.out.println("Enter the elements: ");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("matrix[" + i + "," + j + "]" + "= ");
				array[i][j] = sc.nextInt();
			}
		}
		// Printing the array
		System.out.println("Array looks like: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		double sum = 0d;
		System.out.print("Elements of the fifth column are: " + " ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (j == 4) {
					System.out.print(array[i][j] + ", ");
					sum += array[i][j];
				}
			}
			System.out.print("");
		}

		System.out.println("\nSum of these elements is: " + sum);

		sc.close();
	}
}
