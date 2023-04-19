package LoopStructures_07;
//@author Milica Jaric

import java.text.DecimalFormat;

public class Task120_ForLoop16 {
	/*
	 * Write a program to calculate the value of the sum.
	 * 
	 */
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.###");
		// Initialization of the variable s
		double s = 0;
		// Calculation of the sum value
		for (int n = 1; n <= 50; n++)
			s += (n + 2.5) / (n * n + 1.2);
		// Printing the output result
		System.out.println("The obtained sum value is " + df.format(s));
	}

}
