package org.functional.LoopStructures_07;

import java.text.DecimalFormat;

//@author Milica Jaric

public class Task125_ForLoop21 {
	/*
	 * Create an algorithm and write a program to calculate the value of the
	 * product.
	 * 
	 */
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.###");
		// Initialize variable p
		double p = 1;
		// Calculate the product value
		for (int n = 1; n <= 5; n++)
			p *= (double) (n + 2.5) / (n * n + 1.2);

		// Print the output result

		System.out.println("The obtained product value is " + df.format(p));
	}

}
