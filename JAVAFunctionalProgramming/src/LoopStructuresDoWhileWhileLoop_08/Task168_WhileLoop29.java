package LoopStructuresDoWhileWhileLoop_08;

import java.text.DecimalFormat;

//@author Milica Jaric

public class Task168_WhileLoop29 {

	public static void main(String[] args) {
		double y;
		int i = 0;
		DecimalFormat df = new DecimalFormat("#.##");
		// Printing header
		System.out.println("\tR.BR.\tX\tY(X)");

		// Solution with 'for' loop
		for (double x = 1.0; x <= 2.0; x += 0.2) {
			// Calculating function value
			y = x + 2.5 * Math.pow(x, 3) / (x - 2.8);
			i++;
			// Printing result
			System.out.println("\t" + i + "\t" + df.format(x) + "\t" + df.format(y));
		}

		// Solution with 'while' loop
		System.out.println("\n\tR.BR.\tX\tY(X)");
		double x = 1;
		i = 0;
		y = 0;
		while (x <= 2.0) {
			// Calculating function value
			y = x + 2.5 * Math.pow(x, 3) / (x - 2.8);
			i++;
			// Printing result
			System.out.println("\t" + i + "\t" + df.format(x) + "\t" + df.format(y));
			x += 0.2;
		}

	}
}