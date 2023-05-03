package org.functional.TwoDimensionalArrays_11;

import java.util.Scanner;
//@author Milica Jaric

public class Task235_DDN14 {
	/*
	 * oad two two-dimensional arrays, then calculate the product of the elements
	 * (square matrix)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Number of rows: ");
		int row = sc.nextInt();

		System.out.println("Number of columns: ");
		int column = sc.nextInt();

		int arrA[][] = new int[row][column];
		int arrB[][] = new int[row][column];
		int arrC[][] = new int[row][column];

		System.out.println("Elements of two-dimensional array A: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println("a[" + i + ", " + j + "]" + " = ");
				arrA[i][j] = sc.nextInt();
			}
		}

		System.out.println("Elements of two-dimensional array B: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println("a[" + i + ", " + j + "]" + " = ");
				arrB[i][j] = sc.nextInt();
			}
		}

		// Printing elements of two-dimensional array A:
		System.out.println("The look of array A: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(arrA[i][j] + " ");
			}
			System.out.println();
		}

		// Printing elements of two-dimensional array B:
		System.out.println("The look of array B: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(arrB[i][j] + " ");
			}
			System.out.println();
		}

		// a) Printing the product of the elements of arrays A and B
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arrC[i][j] = arrA[i][j] * arrB[i][j];
			}
		}

		// Printing elements of two-dimensional array C:
		System.out.println("The look of array C (product of the elements of arrays A and B): ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(arrC[i][j] + "");
			}
		}
	}
}
