package org.functional.LoopStructures_07;

import java.util.Scanner;

//@author Milica Jaric

public class Task172_WhileLoop33 {
	/*
	 * Write a program that reads numbers that are divisible by 3. Find the
	 * arithmetic mean of the entered numbers that are greater than 5 and less than
	 * 20.
	 */
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Enter a value for a:");
		int a = ulaz.nextInt();
		int suma = 0, brojac = 0;
		while (a % 3 == 0) {
			if (a > 5 && a < 20) {
				suma += a;
				brojac++;
			}
			System.out.println("Enter a value for a:");
			a = ulaz.nextInt();
		}
		if (brojac != 0) {
			double sr = (double) suma / brojac;
			System.out.println("The arithmetic mean is " + sr);
		}

	}
}
