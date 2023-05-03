package org.functional.OnedimensionalArrays_10;

import java.util.Scanner;

//@author Milica Jaric

public class Task183_JDB05 {
	/*
	 * Write a program that prints the largest digit of the elements of array X of N
	 * elements.
	 * 
	 * rust Copy code Explanation: x = {123, 452, 567, 890} 123 -> 3 452 -> 5 567 ->
	 * 7 890 -> 9
	 * 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array n: ");
		int n = input.nextInt();
		int x[] = new int[n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = input.nextInt();
		}
		int digit;
		for (int i = 0; i < x.length; i++) {
			int max = 0, a = x[i];
			while (a != 0) {
				digit = a % 10;
				if (digit > max)
					max = digit;
				a /= 10;
			}
			// Added: find product of the maximum digits
			System.out.println("The largest digit of the element " + x[i] + " is " + max);

		}

	}
}
