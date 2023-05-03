package org.functional.OnedimensionalArrays_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Milica Jaric

public class Task208_WhileLoop28 {
	/*
	 * Three positive numbers x, y, z represent the sides of a triangle if they
	 * satisfy the conditions: x + y > z and |x - y| < z
	 * 
	 * Write an algorithm and a program that for each of n triples of numbers (ai,
	 * bi, ci, i = 1, ..., n) checks whether they represent the sides of a triangle.
	 * Print ai, bi, ci and the answer "yes" (if they form a triangle) or "no" (if
	 * they do not form a triangle).
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {

		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Input data n
		System.out.println("Enter the number of triples of sides n: ");
		int n = Integer.parseInt(ulaz.readLine());

		// Input triangle sides
		System.out.println("Enter the sides of the triangle a, b, c:");
		for (int i = 1; i <= n; i++) {
			System.out.println("Possible sides of the " + i + ". triangle: ");
			System.out.print("a = ");
			a[i] = Double.parseDouble(ulaz.readLine());
			System.out.print("b = ");
			b[i] = Double.parseDouble(ulaz.readLine());
			System.out.print("c = ");
			c[i] = Double.parseDouble(ulaz.readLine());
		}

		// Processing
		System.out.println("\ta\tb\tc\todgovor ");

		for (int i = 1; i <= n; i++) {
			if (a[i] + b[i] > c[i] && Math.abs(a[i] - b[i]) < c[i])
				System.out.println("\t" + a[i] + "\t" + b[i] + "\t" + c[i] + "\t" + "da");
			else
				System.out.println("\t" + a[i] + "\t" + b[i] + "\t" + c[i] + "\t" + "ne");
		}

	}
}
