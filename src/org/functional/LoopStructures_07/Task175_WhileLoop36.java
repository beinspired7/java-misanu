package org.functional.LoopStructures_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

//@author Milica Jaric

public class Task175_WhileLoop36 {
	/*
	 * Write a program that reads a value of x and an accuracy value eps, and
	 * calculates the sum of the following series:
	 * 
	 * a0 + a1 + a2 + ...
	 * 
	 * where
	 * 
	 * a0 = 1
	 * 
	 * an = (x^2 / (2n + 2)(2n + 1)) * an-1
	 * 
	 * The program should print the sum S with the given accuracy eps. The series
	 * should converge for |x| < 4.
	 * 	 * 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// a0 - first term of the sum
		// s - the sum
		// eps - the accuracy value
		double a0, s;
		int k;
		DecimalFormat df = new DecimalFormat("#.##");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		// Input data
		System.out.println("Enter the value of x: ");
		double x = Double.parseDouble(input.readLine());
		System.out.println("Enter the value of eps: ");
		double eps = Double.parseDouble(input.readLine());
		// Checking the convergence of the series
		if (Math.abs(x) < 4) {
			// Calculating the sum of the series
			a0 = 1.0;
			s = a0;
			k = 0;
			while (Math.abs(a0 / s) > eps) {
				a0 = x * x / ((2 * k + 2) * (2 * k + 1)) * a0;
				s += a0;
				k++;
			}
			// Printing the result
			System.out.println("The sum S = " + df.format(s));
		} else
			System.out.println("The series converges only for |x| < 4.");
	}

}
