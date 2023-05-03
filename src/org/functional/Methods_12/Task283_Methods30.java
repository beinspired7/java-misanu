package org.functional.Methods_12;
//@author Milica Jaric

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task283_Methods30 {
	// Write a program that transposes the elements of a rectangular matrix.

	public class Methods27 {
		static void displayMatrix(int matrix[][], int n, int m) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= m; j++)
					System.out.print(" " + matrix[i][j]);
				System.out.println();
			}
		}

		static void transpose(int m1[][], int m2[][], int rows, int cols) {
			for (int i = 1; i <= rows; i++)
				for (int j = 1; j <= cols; j++)
					m2[j][i] = m1[i][j];
		}

		public static void main(String[] args) throws Exception {
			int[][] matrix = new int[10][10];
			int[][] b = new int[10][10];
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the number of rows n of the matrix: ");
			int n = Integer.parseInt(input.readLine());
			System.out.println("Enter the number of columns m of the matrix: ");
			int m = Integer.parseInt(input.readLine());
			System.out.println("Enter the elements of the matrix: ");
			for (int i = 1; i <= n; i++)
				for (int j = 1; j <= m; j++) {
					System.out.print("matrix[" + i + "]" + "[" + j + "]: ");
					matrix[i][j] = Integer.parseInt(input.readLine());
				}
			System.out.println("Printing the matrix before the element transposition");
			displayMatrix(matrix, n, m);
			System.out.println("Printing the matrix after the element transposition");
			transpose(matrix, b, n, m);
			displayMatrix(b, m, n);
		}
	}

}
