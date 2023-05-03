package org.functional.LinearStructures_01;
//@author Milica Jaric

import java.util.Scanner;

//Write a program that calculates the perimeter and area of a triangle based on the entered sides of the triangle.

public class Triangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the sides of the triangle a, b, c");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double perimeter = a + b + c;
		System.out.println("The perimeter of the triangle is " + perimeter);
		double s = perimeter / 2;
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.print("The area of the triangle is " + area);

		input.close();

	}

}
