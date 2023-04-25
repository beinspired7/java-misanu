package OnedimensionalArrays_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Milica Jaric

public class Task188_WhileLoop10 {
	/*
	 * Create an algorithm and write a program to determine the maximum and minimum
	 * element in an integer array X of N elements.
	 * 
	 * Explanation: 1 2 3 4 <- array element indices x = {3, 6, 2, 8} min = max = 3
	 * = x[1] I step 6 > 3 max = 6; 6 < 3 min = 3 II step 2 > 6 max = 6; 2 < 3 min =
	 * 2 III step 8 > 6 max = 8; 8 < 2 min = 2
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] x = new int[100];
		int max, min;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Input array size
		System.out.println("Enter the number of elements N in array X:");
		int n = Integer.parseInt(ulaz.readLine());

		// Input array elements
		System.out.println("Enter the elements of array X:");
		for (int i = 0; i < n; i++) {
			System.out.print("X[" + i + "] = ");
			x[i] = Integer.parseInt(ulaz.readLine());
		}

		// Finding maximum and minimum
		max = min = x[0];
		for (int i = 1; i < n; i++) {
			if (x[i] > max) {
				max = x[i];
			}
			if (x[i] < min) {
				min = x[i];
			}
		}

	}
}
