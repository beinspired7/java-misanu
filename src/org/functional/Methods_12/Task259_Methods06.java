package org.functional.Methods_12;

import java.text.DecimalFormat;

//@author Milica Jaric

/*
Write an algorithm and program to tabulate the values of the function

y = f(2g(f(x)))

for x = 0.1(0.1)0.9, where

f(x) = 2x - ln(x), g(x) = tg(x/2) + |x|

Print the output table in the following format:

X Y
x.xx xx.xxxx

Note: Use methods to calculate the functions f and g.

 */
public class Task259_Methods06 {
	public class Methods06a { // Define functions f and g
		static double f(double x) {
			return 2 * x - Math.log(x);
		}

		static double g(double x) {
			return Math.tan(x / 2.) + Math.abs(x);
		}

		public static void main(String[] args) {
			DecimalFormat df = new DecimalFormat("###,##0.00"); // Declare variables x and y
			double x, y; // Print header
			System.out.println("\tX\tY");
			for (x = 0.1; x <= 0.9; x += 0.1) { // Call functions f and g
				y = f(2 * g(f(x))); // Print output result
				System.out.println("\t" + df.format(x) + "\t" + df.format(y));
			}
		}
	}
}
