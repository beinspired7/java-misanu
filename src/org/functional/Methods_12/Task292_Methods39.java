package org.functional.Methods_12;
//@author Milica Jaric

/*
 * Write a program that selects, from k lines in the plane given by the coordinates of their endpoints, the one whose center is at the shortest distance from the coordinate origin.

Note: To calculate the distance between two points in the plane, use the following formula:

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task292_Methods39 {
// Method for calculating the distance between two points
	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}

	public static void main(String[] args) throws Exception {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

// Declaring variables
		int k;
		double min, x1, x2, y1, y2, xm1, xm2, ym1, ym2;

// Input the number of lines
		System.out.print("Enter the number of lines k: ");
		k = Integer.parseInt(input.readLine());

// Input the coordinates of the first line
		System.out.println("Enter the coordinates of the 1st line:");
		System.out.print("x1 = ");
		x1 = Double.parseDouble(input.readLine());
		System.out.print("y1 = ");
		y1 = Double.parseDouble(input.readLine());
		System.out.print("x2 = ");
		x2 = Double.parseDouble(input.readLine());
		System.out.print("y2 = ");
		y2 = Double.parseDouble(input.readLine());

// Calculate the distance of the first line from the origin
		min = distance((x1 + x2) / 2, (y1 + y2) / 2, 0, 0);
		xm1 = x1;
		xm2 = x2;
		ym1 = y1;
		ym2 = y2;

		for (int i = 2; i <= k; i++) {
			// Input the coordinates of the k-1 line
			System.out.println("Enter the coordinates of the " + i + " line:");
			System.out.print("x1 = ");
			x1 = Double.parseDouble(input.readLine());
			System.out.print("y1 = ");
			y1 = Double.parseDouble(input.readLine());
			System.out.print("x2 = ");
			x2 = Double.parseDouble(input.readLine());
			System.out.print("y2 = ");
			y2 = Double.parseDouble(input.readLine());

			// Find the line whose center is at the shortest distance from the origin
			if (min > distance((x1 + x2) / 2, (y1 + y2) / 2, 0, 0)) {
				min = distance((x1 + x2) / 2, (y1 + y2) / 2, 0, 0);
				xm1 = x1;
				xm2 = x2;
				ym1 = y1;
				ym2 = y2;
			}
		}
// Print the result
		System.out.println("Coordinates of the line with the shortest distance are: ");
		System.out.println(
				"x1 = " + xm1 + " y1 = " + ym1 + " x2 = " + xm2 + " y2 = " + ym2 + " and the distance is " + min);
	}
}
