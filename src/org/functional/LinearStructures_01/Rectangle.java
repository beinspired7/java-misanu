package org.functional.LinearStructures_01;
//@author Milica Jaric

import java.util.Scanner;

//Write a program to calculate the diagonal of a rectangle for the entered sides of the rectangle a and b.

public class Rectangle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of the side a of the rectangle: ");
		double a = input.nextDouble();
		System.out.println("Enter the value of the side b of the rectangle: ");
		double b = input.nextDouble();
		System.out.println("The diagonal of the rectangle is: " + Math.sqrt(a * a + b * b));
		input.close();
	}

}
