package org.functional.OnedimensionalArrays_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Milica Jaric

public class Task198_WhileLoop18 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		double s = 0, s1 = 0, p = 1;

		// Creating an integer array x
		double[] x = new double[100];

		// Inputting the value of variable n
		System.out.print("Enter the number of elements n in array x: ");
		int n = Integer.parseInt(ulaz.readLine());

		// Inputting the elements of array x
		System.out.println("Enter the elements of array x: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = Double.parseDouble(ulaz.readLine());
		}
		for (int i = 1; i <= n; i++) {
			s += x[i] * x[i];
			s1 += x[i];
			p *= x[i];
		}

		s = Math.sqrt(s / n - Math.pow(s1 / n, 2));
		p = Math.pow(p, 1. / n);

		System.out.print("S = " + s + "\t P = " + p);
	}
}
