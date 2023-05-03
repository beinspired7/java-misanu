package org.functional.OnedimensionalArrays_10;

import java.util.Scanner;

//@author Milica Jaric

public class Task180_JDB03 {
	/*
	 * Write a program that prints out adjacent members of the X array of N elements whose sum is even.
	 * 
	 * Code Explanation:
	 * 
	 * The check is performed by the command if ((x[i - 1] + x[i]) % 2 == 0), in
	 * which the sum of two adjacent members of the array is calculated x[i - 1] +
	 * x[i], and by the command % 2 == 0, the evenness of the sum is checked.
	 */
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array n: ");
		int n = ulaz.nextInt();
		int x[] = new int[n];
		System.out.println("Enter the array members:");
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = ulaz.nextInt();
		}
		for (int i = 1; i < n; i++)
			if ((x[i - 1] + x[i]) % 2 == 0)
				System.out.println(x[i - 1] + " " + x[i]);
	}

}
