package TwoDimensionalArrays_11;

import java.util.Scanner;

//@author Milica Jaric

public class Task252_DDN31 {
/*
 * Load a two-dimensional array - matrix nxm. Calculate and print the sum of negative elements.
 */
	public static void main(String[] args) {
		  // Load a two-dimensional array - matrix 5x5. Calculate and print the sum of all
	    // negative elements
			Scanner sc = new Scanner(System.in);

	    System.out.println("Enter the number of rows: ");
	    int row = sc.nextInt();

	    System.out.println("Enter the number of columns: ");
	    int column = sc.nextInt();

	    // "Matrix" = name of our two-dimensional array
	    int array[][] = new int[row][column];

	    System.out.println("Enter the elements: ");

	    for (int i = 0; i < row; i++) {
	        for (int j = 0; j < column; j++) {
	        System.out.println("matrix[" + i + "," + j + "]" + "= ");
	        array[i][j] = sc.nextInt();
	        }
	    }
	    // Print the array
	    System.out.println("\nArray looks like this: ");
	    for (int i = 0; i < row; i++) {
	        for (int j = 0; j < column; j++) {
	        System.out.print(array[i][j] + " ");
	        }
	        System.out.println();
	    }

	    double sum = 0d;
	    System.out.print("Elements smaller than 0 are: " + " ");
	    for (int i = 0; i < row; i++) {
	        for (int j = 0; j < column; j++) {
	        if (array[i][j] < 0) {
	            System.out.print(array[i][j] + ", ");
	            sum += array[i][j];
	        }
	        }
	        System.out.print("");
	    }

	    System.out.println("\nThe sum of those elements is: " + sum);

	    sc.close();
	}

}
