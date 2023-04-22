package TwoDimensionalArrays_11;

import java.util.Scanner;

//@author Milica Jaric

public class Task229_DDN08 {
/*
 * Load elements of a two-dimensional array, and then print the elements with odd column indices.

 */
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

	    // c) Print the elements with odd column indices

	    System.out.println("Elements with odd column indices: ");
	    for (int i = 0; i < row; i++) {
	        for (int j = 0; j < column; j++) {
	        if ((j + 1) % 2 != 0) {
	            System.out.print(array[i][j] + " ");
	        }
	        }
	        System.out.println();

	    }
		
	}

}
