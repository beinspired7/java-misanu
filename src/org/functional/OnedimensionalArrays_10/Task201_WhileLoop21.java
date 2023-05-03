package org.functional.OnedimensionalArrays_10;
//@author Milica Jaric

import java.util.Scanner;

public class Task201_WhileLoop21 {
	/*
	 * Write a program that prints the smallest digit of the elements of the array X
	 * of N elements.
	 */
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array n: ");
		int n = ulaz.nextInt();

		int x[] = new int[n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = ulaz.nextInt();
		}

		int cifra;
		for (int i = 0; i < x.length; i++) {
			int min = 10, a = x[i];
			while (a != 0) {
				cifra = a % 10;
				if (cifra < min)
					min = cifra;

				a /= 10;
			}

			System.out.println("The smallest digit of element " + x[i] + " is " + min);
		}
	}
}
