package org.functional.LoopStructures_07;
//@author Milica Jaric

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Task126_ForLoop22 {
	/*
	 * Create an algorithm and write a program to calculate the value of the product
	 * shown in the picture for a given value of n < 100.
	 * 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		DecimalFormat df = new DecimalFormat("#.###");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		// Initialization of variables p and q
		double p = 1, q = 1;
		// Enter the value of variable n
		System.out.print("Enter the value for n: ");
		int n = Integer.parseInt(ulaz.readLine());
		// Calculation of product value
		for (int i = 2; i <= n; i++) {
			q *= i;
			p *= (1 + 1 / q);
		}
		// Printing the output result
		System.out.println("The resulting value of the product is " + df.format(p));
	}

}
