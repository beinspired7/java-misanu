package org.functional.LinearStructures_01;
//@author Milica Jaric

import java.util.Scanner;

//		Write a program that calculates y for the given values of a and b according to the formula. Print the value of y as output.

public class MinMax {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value for a: ");
		double a = input.nextDouble();
		System.out.print("Enter a value for b: ");
		double b = input.nextDouble();
		System.out.println("y = " + (1 - Math.min(a, b)) / (1 + Math.max(a, b)));
		input.close();
	}

}
