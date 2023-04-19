package LoopStructuresDoWhileWhileLoop_08;
//@author Milica Jaric

import java.text.DecimalFormat;

public class Task154_WhileLoop15 {

	public static void main(String[] args) {
		double y, j = 1.0;
		int i = 0;
		DecimalFormat df = new DecimalFormat("#.##");
		// Print header
		System.out.println("\tSolution with FOR loop");
		System.out.println("\t_______________________");

		// Solution with FOR
		System.out.println("\tNo.\tX\tY(X)");
		for (double x = 1.0; x <= 10.0; x += 0.5) {
			y = x - 0.3 * Math.pow(x, 2) / (x + 1.2);
			i++;
			System.out.println("\t" + i + "\t" + df.format(x) + "\t" + df.format(y));
		}

		// Solution with WHILE
		System.out.println("\n\tSolution with WHILE loop");
		System.out.println("\t_______________________");
		System.out.println("\tNo.\tX\tY(X)");

		while (j <= 10.0) {
			// Calculate function value
			y = j - 0.3 * Math.pow(j, 2) / (j + 1.2);
			i++;
			// Print result
			System.out.println("\t" + i + "\t" + df.format(j) + "\t" + df.format(y));
			j += 0.5;
		}

	}
}
