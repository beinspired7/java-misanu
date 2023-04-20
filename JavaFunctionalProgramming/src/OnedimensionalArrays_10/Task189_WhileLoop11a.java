package OnedimensionalArrays_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task189_WhileLoop11a {
	// @author Milica Jaric
	/*
	 * Write a program that determines the maximum element and its index in an
	 * integer vector X of N elements.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] x = new int[100];

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number of elements in vector x:");
		int n = Integer.parseInt(input.readLine());

		System.out.println("Enter the elements of vector x: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = Integer.parseInt(input.readLine());
		}

		int max = x[1], imax = 1;
		for (int i = 2; i <= n; i++) {
			if (x[i] > max) {
				max = x[i];
				imax = i;
			}
		}

		System.out.println("Index of maximum element ( " + max + " ) is " + imax);
	}

}
