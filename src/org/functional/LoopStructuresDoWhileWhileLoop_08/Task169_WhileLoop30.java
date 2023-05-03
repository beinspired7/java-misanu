package org.functional.LoopStructuresDoWhileWhileLoop_08;

import java.util.Scanner;

//@author Milica Jaric

public class Task169_WhileLoop30 {
	/*
	 * Write a program that, for given natural numbers a and b, prints numbers from
	 * the interval [a, b], where the first number to be printed is equal to a, and
	 * each subsequent number is four times greater than the previous one. For
	 * example, for [a, b] = [5, 100], the program should print 5, 20, 80.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a = input.nextInt();
		System.out.println("Enter the value of b:");
		int b = input.nextInt();
		while (a <= b) {
			System.out.println(a);
			a *= 4;
		}

	}
}
