package TwoDimensionalArrays_11;

import java.util.Scanner;

//@author Milica Jaric

public class Task251_DDN30 {
	/*
	 * Load a two-dimensional array - matrix nxm. Calculate and print out a)
	 * arithmetic mean of positive elements
	 */
	public static void main(String[] args) {
		// Load a two-dimensional array - matrix 5x5. Calculate and print out
		// a) arithmetic mean of positive elements
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();

		System.out.println("Enter the number of columns: ");
		int col = sc.nextInt();

		// "Matrix" = name of our two-dimensional array
		int arr[][] = new int[row][col];

		System.out.println("Enter elements: ");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("matrix[" + i + "," + j + "]" + "= ");
				arr[i][j] = sc.nextInt();
			}
		}
		// Print the array
		int count = 0;
		double sum = 0d;
		System.out.println("\nArray contents: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
				if (arr[i][j] > 0) {
					count++;
					sum += arr[i][j];
				}
			}
			System.out.println();
		}

		double arMean = sum / count;

		System.out.println("\nThe arithmetic mean of positive elements is: " + arMean);

		sc.close();
	}
}
