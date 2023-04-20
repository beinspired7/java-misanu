package OnedimensionalArrays_10;
//@author Milica Jaric

import java.util.Scanner;

public class Task186_WhileLoop08 {
	/*
	 * Write a program that prints the reciprocal value of a member of an array X of
	 * N elements if it is even, and if it is odd, its square is printed, provided
	 * that zero is not entered for the array member X.
	 * 
	 * Solution description: The task can be described using the following formula:
	 * 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of array elements n: ");
		int n = input.nextInt();

		int x[] = new int[n];
		System.out.println("Enter the array members:");
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = input.nextInt();
		}

		double y;
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0)
				y = (double) 1 / x[i];
			else
				y = x[i] * x[i];

			System.out.println("For " + x[i] + " the result is y = " + y);
		}
	}
}
