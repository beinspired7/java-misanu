package org.functional.TwoDimensionalArrays_11;

import java.util.Scanner;

//@author Milica Jaric

public class Task230_DDN09 {
//Load the elements of a two-dimensional array, then print the elements with even column indexes

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

		// c) Print elements with even column indexes

		System.out.println("Elements with even column indexes: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if ((j + 1) % 2 == 0) {
					System.out.print(array[i][j] + " ");
				}
			}
			System.out.println();
		}

	}
}
