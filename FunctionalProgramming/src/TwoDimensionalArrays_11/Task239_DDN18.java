package TwoDimensionalArrays_11;

import java.util.Scanner;

//@author Milica Jaric

public class Task239_DDN18 {
/*
 * Load a two-dimensional array and find the smallest element.
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

	    // a) Load a two-dimensional array and find the SMALLEST element
	    int min = array[0][0];

	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < columns; j++) {

	        if (min >= array[i][j]) {
	            min = array[i][j];
	        }

	        }

	    }
	    System.out.println("The smallest number in the 2D array is: " + min);
	    sc.close();

	}

}
