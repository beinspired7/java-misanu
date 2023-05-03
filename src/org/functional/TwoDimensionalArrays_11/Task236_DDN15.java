package org.functional.TwoDimensionalArrays_11;

import java.util.Scanner;

//@author Milica Jaric

public class Task236_DDN15 {
//Load a two-dimensional array and find the largest element.


	public static void main(String[] args) {
		int[][] a = new int[20][20];
		int[][] b = new int[20][20];
		int[][] c = new int[20][20];
		
		    Scanner input = new Scanner(System.in);

		    // Input matrix dimensions
		    System.out.println("Enter matrix dimensions m, n, k: ");
		    // m = Number of rows in the first matrix
		    System.out.println("m = ");
		    int m = input.nextInt();
		    // n = Number of columns in the first matrix & number of rows in the second matrix
		    System.out.println("n = ");
		    int n = input.nextInt();
		    // k = Number of columns in the second matrix
		    System.out.println("k = ");
		    int k = input.nextInt();
		    System.out.println("Scalar value: ");
		    int s = input.nextInt();

		    // Input matrix A
		    System.out.println("Enter matrix a elements: ");
		    for (int i = 1; i <= m; i++) {
		        for (int j = 1; j <= n; j++) {
		            System.out.println("a[" + i + "][" + j + "] = ");
		            a[i][j] = input.nextInt();
		        }
		    }

		    // Input matrix B
		    System.out.println("Enter matrix b elements: ");
		    for (int i = 1; i <= n; i++) {
		        for (int j = 1; j <= k; j++) {
		            System.out.println("b[" + i + "][" + j + "] = ");
		            b[i][j] = input.nextInt();
		        }
		    }

		    // Find product of two matrices
		    for (int i = 1; i <= m; i++) {
		        for (int j = 1; j <= k; j++) {
		            c[i][j] = 0;
		            for (int t = 1; t <= n; t++) {
		                c[i][j] += s * a[i][t] * b[t][j];
		            }
		        }
		    }

		    // Print array A
		    System.out.println("Array A: ");
		    for (int i = 1; i <= m; i++) {
		        for (int j = 1; j <= n; j++) {
		            System.out.print(a[i][j] + " ");
		        }
		        System.out.println();
		    }

		    // Print array B
		    System.out.println("Array B: ");
		    for (int i = 1; i <= n; i++) {
		        for (int j = 1; j <= k; j++) {
		            System.out.print(b[i][j] + " ");
		        }
		        System.out.println();
		    }

		    // Print output result
		    System.out.println("Product of matrices with scalar (" + s + ") is: ");
		    for (int i = 1; i <= m; i++) {
		        for (int j = 1; j <= k; j++) {
		            System.out.println(c[i][j] + " ");
		        }
		        System.out.println();
		    }
		
	}

}
