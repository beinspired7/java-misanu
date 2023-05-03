package org.functional.LoopStructuresDoWhileWhileLoop_08;

import java.text.DecimalFormat;

//@author Milica Jaric

public class Task153_WhileLoop14 {

	public static void main(String[] args) {
		double f, x = 1.0;
		DecimalFormat df = new DecimalFormat("#.##");
		// Print header
		System.out.println("\tX\tF(X)");
		while (x <= 2.0) {
			// Calculate function value
			f = 41.926 * Math.sqrt(1 + Math.pow(x, 3)) + Math.pow(x, 1.0 / 3.0) * Math.exp(x);
			// Print result
			System.out.println("\t" + df.format(x) + "\t" + df.format(f));
			x += 0.2;
		}
		// Solution with for loop
		System.out.println("\t---------------");
		System.out.println("\tX\tF(X)");
		for (x = 1.0; x <= 2.0; x += 0.2) {
			// Calculate function value
			f = 41.926 * Math.sqrt(1 + Math.pow(x, 3)) + Math.pow(x, 1.0 / 3.0) * Math.exp(x);
			// Print result
			System.out.println("\t" + df.format(x) + "\t" + df.format(f));
		}

	}
}
