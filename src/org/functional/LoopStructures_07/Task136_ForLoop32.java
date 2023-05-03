package org.functional.LoopStructures_07;

import java.text.DecimalFormat;

//@author Milica Jaric

public class Task136_ForLoop32 {

	public static void main(String[] args) {
		// Declaration of variables
		double x, y, z;
		// Initializing the serial number
		int i = 0;
		DecimalFormat df = new DecimalFormat("#.##");
		// Printing header
		System.out.println("\tR.br.\tX\tY\tZ");
		for (x = 0.0; x <= 10.0; x += 1.0) {
			// Calculation of function values
			y = Math.sqrt(x) + 0.2 * x - Math.pow(x, 2) / (x + 1.);
			z = y - 0.3 * Math.pow(y, 2) / (y + 1.);
			// Incrementing the serial number
			i++;
			// Printing the result
			System.out.println("\t" + i + "\t" + df.format(x) + "\t" + df.format(y) + "\t" + df.format(z));
		}

	}
}
