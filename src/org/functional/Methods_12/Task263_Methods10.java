package org.functional.Methods_12;
//@author Milica Jaric

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task263_Methods10 {

	public class Metode09 {
		// Defining function
		static double t(double z) {
			if (z <= 0)
				return z + 2;
			else if (z > 1)
				return z;
			else
				return Math.exp(z);
		}
	}

	public static void main(String[] args) throws Exception {
		double[] x = new double[100];
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in)); // Inputting dimension of the x
																					// array
		System.out.println("Enter the dimension n of the x array: ");
		int n = Integer.parseInt(ulaz.readLine());
		// Inputting elements of the x array
		System.out.println("Enter the elements of the x array: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = Double.parseDouble(ulaz.readLine());
		} // Printing the header
		System.out.println("\tR.NO.\tX\tY");
		for (int i = 1; i <= n; i++) { // Calculating the value of the function
			double y = t(x[i] + 2) + 1.4 * t(Math.pow(x[i], 2) - 1); // Print
			System.out.println("\t" + i + "\t" + x[i] + "\t" + y);

		}
	}

	private static double t(double d) {
		// TODO Auto-generated method stub
		return 0;
	}
}
