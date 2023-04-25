package LoopStructuresDoWhileWhileLoop_08;

import java.util.Scanner;

//@author Milica Jaric

public class Task144_WhileLoop05 {
	/*
	 * Write a program to print numbers from 1 to the given number n that are divisible by a.
	 */
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		int a, n, i = 1;
		System.out.println("Enter a value for n:");
		n = ulaz.nextInt();
		System.out.println("Enter a value for a:");
		a = ulaz.nextInt();
		while (i <= n) {
			if (i % a == 0)
				System.out.println(i);
			i++;
		}
	}

}
