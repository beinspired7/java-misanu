package org.functional.OnedimensionalArrays_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

//@author Milica Jaric

public class Task195_WhileLoop15 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double[] lazandrovPolynomial = new double[100];

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.###");

		System.out.println("Enter a value for x: ");
		double x = Double.parseDouble(input.readLine());

		lazandrovPolynomial[0] = 1;
		lazandrovPolynomial[1] = x;

		for (int n = 1; n <= 9; n++)
			lazandrovPolynomial[n + 1] = (2 * n + 1) * lazandrovPolynomial[n] / (n + 1)
					- n * lazandrovPolynomial[n - 1] / (n + 1);

		for (int n = 0; n <= 9; n++)
			System.out.println("L(" + n + ") = " + df.format(lazandrovPolynomial[n]));
	}

}
