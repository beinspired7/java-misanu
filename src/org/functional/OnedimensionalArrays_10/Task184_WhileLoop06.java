package org.functional.OnedimensionalArrays_10;
//@author Milica Jaric

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task184_WhileLoop06 {
	/*
	 * Write a program that calculates the product of the digits of the elements in
	 * an array X of N elements.
	 * 
	 * Code Explanation: x = {123, 654, 234} 123 -> 1 * 2 * 3 = 6 654 -> 6 * 5 * 4 =
	 * 120 234 -> 2 * 3* 4 = 24
	 * 
	 * 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of array elements n: ");
		int n = input.nextInt();
		int x[] = new int[n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = input.nextInt();
		}
		int digit;
		for (int i = 0; i < x.length; i++) {
			int p = 1;
			int a = x[i];
			while (a > 0) {
				digit = a % 10;
				p *= digit;
				a /= 10;
			}
			System.out.println("The product of digits of the element " + x[i] + " is " + p);
		}
	}
}