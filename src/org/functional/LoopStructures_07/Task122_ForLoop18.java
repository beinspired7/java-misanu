package org.functional.LoopStructures_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

//@author Milica Jaric

public class Task122_ForLoop18 {
	/*
	 * Write an algorithm and a program to calculate the value of the sum
	 * 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		double s = 0, s1;
		DecimalFormat df = new DecimalFormat("###,##0.00");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a value for n: ");
		int n = Integer.parseInt(ulaz.readLine());
		for (int i = 1; i <= n; i++) {
			s1 = 0;
			for (int j = 1; j <= n; j++) {
				if (j != 3)
					s1 += (j + 3.5) / (j - 3.0);
			}
			s += s1;
		}
		System.out.println("The obtained value of the sum is " + df.format(s));
	}
}
