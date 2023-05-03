package org.functional.Methods_12;

import java.text.DecimalFormat;

//@author Milica Jaric

public class Task276_Methods23 {
/*
Write a program to tabulate the values of the function
f(x) = x4 - 10x3 + 35x2 - 50x + 24
using Horner's scheme for calculating the value of the function. Tabulate the function for x = 0.0(0.1)0.9.
 */
	
	public class Metode20 {
		static double horn(double[] a, int n, double x) {
		double horner = a[n];
		while (n != 0) {
		horner = horner * x + a[n - 1];
		n--;
		}

		return horner;
		}

		public static void main(String[] args) {
		double[] a = { 24, -50, 35, -10, 1 };

		DecimalFormat df = new DecimalFormat("#.##");

		int n = 4;

		System.out.println("\tX\tF(X)");
		for (double x = 0.0; x < 0.9; x += 0.1)
		    System.out.println("\t" + df.format(x) + "\t" + df.format(horn(a, n, x)));
		}
		}

}
