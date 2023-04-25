package LoopStructuresDoWhileWhileLoop_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

//@author Milica Jaric

public class Task158_WhileLoop19 {
	/*
	 * Write a program to calculate the value of the sum
	 * 
	 * S = 1/2 + 2/3 + 3/4 ... + n / (n+1)
	 * 
	 * Solve the task using:
	 * 
	 * a) for loop, b) while loop c) do-while loop
	 * 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		DecimalFormat df = new DecimalFormat("#.###");

		// Solution with 'for' loop
		double sum = 0;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a value for n: ");
		int n = Integer.parseInt(input.readLine());
		for (int i = 1; i <= n; i++)
			sum += (double) i / (i + 1);
		System.out.println("For loop: Sum is " + df.format(sum));

		// Solution with 'while' loop

		int i = 1;
		sum = 0;
		while (i <= n) {
			sum += (double) i / (i + 1);
			i++;
		}
		System.out.println("While loop: Sum is " + df.format(sum));

		// Solution with 'do-while' loop
		i = 1;
		sum = 0;
		do {
			sum += (double) i / (i + 1);
			i++;
		} while (i <= n);
		System.out.println("Do-while loop: Sum is " + df.format(sum));
	}

}
