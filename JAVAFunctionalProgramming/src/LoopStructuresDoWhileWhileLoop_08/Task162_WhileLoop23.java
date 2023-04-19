package LoopStructuresDoWhileWhileLoop_08;

import java.util.Scanner;

//@author Milica Jaric

public class Task162_WhileLoop23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = input.nextInt();
		System.out.println("Enter the value of k:");
		int k = input.nextInt();
		double sum = 0;
		int i = 1;

		// Solution with while loop
		while (i <= n) {
			sum += k * i / Math.pow((2 * i - 1), 2);
			i++;
		}
		System.out.println("Sum s = " + sum);

		// Solution with do-while loop
		sum = 0;
		i = 1;
		do {
			sum += k * i / Math.pow((2 * i - 1), 2);
			i++;
		} while (i <= n);
		System.out.println("Sum s = " + sum);
	}

}
