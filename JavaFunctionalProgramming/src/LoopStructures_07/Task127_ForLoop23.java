package LoopStructures_07;
//@author Milica Jaric

import java.text.DecimalFormat;

public class Task127_ForLoop23 {
	/*
	 * Create an algorithm and write a program to calculate the value of the
	 * function shown in the picture for x = 1.00(0.2)2.00.
	 * 
	 * Solve the problem using a for loop. The output list should look like the one
	 * in the picture.
	 */
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###,##0.00");
		/* Printing the header */
		System.out.println("\tX\tF(X)");
		double f, x;
		for (x = 1.0; x <= 2.0; x += 0.2) {
			f = 41.926 * Math.sqrt(1 + Math.pow(x, 3)) + Math.pow(x, 1.0 / 3.0) * Math.exp(x);
			System.out.println("\t" + df.format(x) + "\t" + df.format(f));
		}
	}
}
