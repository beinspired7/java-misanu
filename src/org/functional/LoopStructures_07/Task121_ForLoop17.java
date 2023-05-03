package org.functional.LoopStructures_07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

//@author Milica Jaric

public class Task121_ForLoop17 {
	/*
	 * Write an algorithm and a program to calculate the value of the sum shown in
	 * the image for an entered value of n < 100.
	 * 
	 * 
	 */

	public static void main(String[] args) throws Exception {
		DecimalFormat df = new DecimalFormat("#.###");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		// Initialization of the variable s
		double s = 0;
		// Input of the variable n
		System.out.print("Enter a value for n: ");
		int n = Integer.parseInt(input.readLine());
		if (n < 100) {
			// Calculation of the sum value
			for (int i = 1; i <= n; i++)
				if (i != 3)
					s += (i + 3.5) / (i - 3.0);
			// Printing the output result
			System.out.println("The obtained sum value is " + df.format(s));
		}
	}
}
