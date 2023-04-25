package TwoDimensionalArrays_11;

import java.util.Scanner;

//@author Milica Jaric

//Load a two-dimensional array and find the largest element.

public class Task238_DDN17 {

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
				System.out.print(array[i][j] + "");
			}
			System.out.println();
		}

		// a) Učitati dvodimenzionalni niz i pronaći Najeveći element
		int max = 0;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (max < array[i][j]) {
					max = array[i][j];
				}

			}

		}
		System.out.println("Bigest number  2D array is: " + max);
		sc.close();

	}
}
