package org.functional.LoopStructuresDoWhileWhileLoop_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

//@author Milica Jaric

public class Task152_WhileLoop13 {
	/*
	 * Create an algorithm and write a program for iteratively solving the system of
	 * equations
	 * 
	 * 4x 2- 3xy + 2x - 1 = 0
	 * 
	 * using the following formulas:
	 * 
	 * Terminate the iterative process when the conditions are met. The value for E
	 * and the initial values for x0 and y0 are given as input. Print the solutions
	 * of the system of equations at the output.
	 * 
	 * a) do-while loop b) while loop
	 * 
	 * 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		DecimalFormat df = new DecimalFormat("#.##");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		// Enter the values of variables eps, x0, and y0
		System.out.print("Enter the value of epsilon: ");
		double eps = Double.parseDouble(input.readLine());
		System.out.print("Enter the value of x0: ");
		double x0 = Double.parseDouble(input.readLine());
		System.out.print("Enter the value of y0: ");
		double y0 = Double.parseDouble(input.readLine());
		// Iterative process for determining the solution of the system of equations
		double x1 = 0.5 * Math.sqrt(x0 * (3 * y0 - 1) + 1);
		double y1 = Math.sqrt((x0 + 3) / 2);
		while (Math.abs(x1 - x0) > eps || Math.abs(y1 - y0) > eps) {
			x0 = x1;
			x1 = 0.5 * Math.sqrt(x0 * (3 * y0 - 1) + 1);
			y0 = y1;
			y1 = Math.sqrt((x0 + 3) / 2);
		}

		// Solution with do-while loop
		do {
			x0 = x1;
			x1 = 0.5 * Math.sqrt(x0 * (3 * y0 - 1) + 1);
			y0 = y1;
			y1 = Math.sqrt((x0 + 3) / 2);
		} while (Math.abs(x1 - x0) > eps || Math.abs(y1 - y0) > eps);

		// Štampanje izlaznog rezultata
		System.out.println(" x = " + df.format(x1) + " i y = " + df.format(y1));
	}
}
