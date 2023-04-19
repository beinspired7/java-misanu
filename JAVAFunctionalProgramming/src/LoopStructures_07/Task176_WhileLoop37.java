package LoopStructures_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

//@author Milica Jaric

public class Task176_WhileLoop37 {
	/*
	 * Write a program that calculates the value of the sum:
	 * 
	 * S = (sin(x) + cos(x)) * (1 + 1/2 - 1/3! + 1/4! - 1/5! + ...)
	 * 
	 * where x is entered from the keyboard (0 < x < 2π) and eps is a small positive
	 * number (e.g. 0.0001) that determines the precision of the calculation.
	 * 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		DecimalFormat df = new DecimalFormat("#.##");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		// Input data
		System.out.println("Enter the value of x: ");
		double x = Double.parseDouble(ulaz.readLine());
		System.out.println("Enter the value of eps: ");
		double eps = Double.parseDouble(ulaz.readLine());
		// Calculating the value of the sum
		double koef = Math.sin(x) + Math.cos(x);
		double a0 = 1.0;
		double s = a0;
		int k = 0;
		while (Math.abs(a0) > eps) {
			a0 = a0 * (k + 1) / (k + 2);
			s += a0;
			k++;
		}
		s *= koef;
		// Printing the result
		System.out.println("The value of the sum is S = " + df.format(s));
	}

}
