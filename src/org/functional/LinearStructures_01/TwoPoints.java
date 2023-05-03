package org.functional.LinearStructures_01;
//@author Milica Jaric

import java.util.Scanner;

/*
 * Read the coordinates of two points M1(x1,y1) and M2(x2, y2) and calculate their mutual distance. 
 * Description of the solution: The triangle formed by the points M1(x1, y1) is considered, the hypotenuse is the length between these points.
 	The legs are Δx = x2- x1, and the second leg of the triangle is Δy = y2- y1. 
	Based on the Pythagorean theorem, the hypotenuse is calculated: hypotenuse d2 = (x2- x1)2 + (y2- y1)2, or the square root of the sum of the squares.
 */
public class TwoPoints {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the coordinates of point M:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Enter the coordinates of point N:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		System.out
				.println("The distance between points M (" + x1 + "," + y1 + ") and N (" + x2 + "," + y2 + ") is " + d);

		input.close();
	}

}
