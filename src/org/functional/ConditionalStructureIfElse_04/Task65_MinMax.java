package org.functional.ConditionalStructureIfElse_04;
//@author Milica Jaric

import java.util.Scanner;

/*
 * Write a program that calculates y according to the formula for the entered values of a and b:   
 */
public class Task65_MinMax {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double a, b;
		double y;
		System.out.println("Enter the value of a: ");
		a = input.nextDouble();
		System.out.println("Enter the value of b: ");
		b = input.nextDouble();
		if (a >= 0)
			y = (1 - Math.min(a, b)) / (1 + Math.max(a, b));
		else
			y = Math.min(a, b) / (Math.min(a * a, b * b) + 3);
		System.out.println("y is " + y);
		input.close();
	}

}
