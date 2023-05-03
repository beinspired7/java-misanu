package org.functional.TwoDimensionalArrays_11;
//@author Milica Jaric

import java.util.Scanner;

//Load a two-dimensional array and calculate the sum of all elements.


public class Task237_DDN16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Number of rows: ");
		int row = sc.nextInt();

		System.out.println("Number of columns: ");
		int column = sc.nextInt();

		int array[][] = new int[row][column];

		System.out.println("Elements of the matrix: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println("a[" + i + ", " + j + "]" + " = ");
				array[i][j] = sc.nextInt();
			}
		}

		// Array display
		System.out.println("Array A: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		double sum = 0d;
		// Printing the elements of a 2D array
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				sum += array[i][j];
			}

		}
		System.out.println("Sum of all elements of the array is: " + sum);
		sc.close();

	}

}
