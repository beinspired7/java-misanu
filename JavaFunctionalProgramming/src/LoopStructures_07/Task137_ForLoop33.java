package LoopStructures_07;

import java.text.DecimalFormat;

//@author Milica Jaric

public class Task137_ForLoop33 {
	/*
	 * Write an algorithm and a program to tabulate the values of the functions
	 * shown in the image if a is 0.1(0.1)0.5 and b=0.1(0.1)0.2
	 */
	public static void main(String[] args) {
		// Declaration of variables a and b
		double a, b;
		DecimalFormat df = new DecimalFormat("###,###0.000");
		// Printing header
		System.out.println("\ta\tb\tcos(a) - cos(b)\t-2 * sin(a + b) / 2 * sin(a - b) / 2");
		for (a = 0.1; a <= 0.5; a += 0.1)
			for (b = 0.1; b <= 0.2; b += 0.1) {
				// Calculation of function values
				double p = Math.cos(a) - Math.cos(b);
				double q = -2 * Math.sin((a + b) / 2) * Math.sin((a - b) / 2);
				// Printing the output result
				System.out
						.println("\t" + df.format(a) + "\t" + df.format(b) + "\t" + df.format(p) + "\t" + df.format(q));
			}
	}
}
