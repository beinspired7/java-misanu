package LoopStructures_07;
//@author Milica Jaric

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Task124_ForLoop20 {
	/*
	 * Create an algorithm and write a program to calculate the value of the
	 * expression shown in the image if the square root is applied n times.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		DecimalFormat df = new DecimalFormat("#.###");

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		// Initialize variable s
		double s = 0;
		// Input the value of variable n
		System.out.print("Enter the value for n: ");
		int n = Integer.parseInt(ulaz.readLine());
		// Calculate the sum
		for (int i = 1; i <= n; i++)
			s = Math.sqrt(6 + s);
		// Print the output result
		System.out.println("The obtained sum value is " + df.format(s));
	}

}
