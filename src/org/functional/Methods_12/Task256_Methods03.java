package org.functional.Methods_12;
//@author Milica Jaric

public class Task256_Methods03 {

//	Write a method for printing a square matrix of size 2. In the main program, enter the matrix and print it.

	public class Metode03 {
		final static int row = 2;
		final static int column = 2;

		static void showMatrix(int matrix[][]) {
			System.out.println("The resulting matrix looks like ");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++)
					System.out.print(" " + matrix[i][j]);
				System.out.println();
			}
		}

		public static void main(String[] args) {
			int a[][] = { { 1, 2 }, { 3, 4 } };
			showMatrix(a);
		}

	}
}
