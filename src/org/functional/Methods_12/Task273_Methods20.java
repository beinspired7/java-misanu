package org.functional.Methods_12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//@author Milica Jaric

public class Task273_Methods20 {
	/*
	 * Write a method that finds the equivalent capacitance of two capacitors with
	 * capacitances C1 = 10 nF and C2 = 15 nF, if they are connected: a) in series,
	 * b) in parallel.
	 * 
	 * Explanation: The equivalent capacitance of series connection is calculated
	 * using the formula
	 * 
	 * Ce = C1*C2 / (C1 + C2) and the equivalent capacitance of parallel connection
	 * is calculated using the formula Ce = C1+C2
	 * 
	 */

	public class Metode17 {
		public static void findCapacitorConnection(double c1, double c2, int connectionType) {
			double ce;
			switch (connectionType) {
			case 1:
				/*
				 * Calculation of capacitance of series connection / ce = c1 * c2 / (c1 + c2);
				 * System.out.println("The capacitance of series connection is " + ce); break;
				 * case 2: / Calculation of capacitance of parallel connection
				 */
				ce = c1 + c2;
				System.out.println("The capacitance of parallel connection is " + ce);
				break;
			default:
				System.out.println("Enter 1 for series connection or 2 for parallel connection.");
				break;
			}
		}

public static void main(String[] args) throws Exception {
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); // Input for the type of capacitor connection
System.out.println("Enter 1 for series connection or 2 for parallel connection: ");
int i = Integer.parseInt(input.readLine()); // Input for capacitor capacitance
System.out.println("Enter the value of the capacitance of the first capacitor: ");
double c1 = Double.parseDouble(input.readLine());
System.out.println("Enter the value of the capacitance of the second capacitor: ");
double c2 = Double.parseDouble(input.readLine());
findCapacitorConnection(c1, c2, i);
}
}}
