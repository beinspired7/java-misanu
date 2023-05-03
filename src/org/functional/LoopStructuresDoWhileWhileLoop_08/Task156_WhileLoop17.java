package org.functional.LoopStructuresDoWhileWhileLoop_08;
//@author Milica Jaric

import java.util.Scanner;

public class Task156_WhileLoop17 {
	/*
	 * Scanner input = new Scanner(System.in); int n, k; double s = 0;
	 * System.out.print("Enter a value for n: "); n = input.nextInt();
	 * System.out.print("Enter a value for k: "); k = input.nextInt(); int i = 0;
	 * while (i <= n) { s += (i + 1) / (double) (k + i); ++i; }
	 * System.out.println("The sum is " + s);
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, k;
		double s = 0;
		System.out.print("Enter a value for n: ");
		n = input.nextInt();
		System.out.print("Enter a value for k: ");
		k = input.nextInt();
		int i = 0;
		while (i <= n) {
			s += (i + 1) / (double) (k + i);
			++i;
		}
		System.out.println("The sum is " + s);
	}

}
