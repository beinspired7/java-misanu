package LoopStructures_07;
//@author Milica Jaric

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Task123_ForLoop19 {
	/*
	 * Write a program to calculate the value of the sum Code:
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		double sum = 0;
		DecimalFormat df = new DecimalFormat("#.###");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a value for n: ");
		int n = Integer.parseInt(input.readLine());
		for (int i = 1; i <= n; i++)
			sum += (double) i / (i + 1);
		System.out.println("The obtained value of the sum is " + df.format(sum));
	}

}
