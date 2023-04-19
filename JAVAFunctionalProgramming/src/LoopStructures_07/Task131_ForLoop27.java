package LoopStructures_07;
//@author Milica Jaric

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task131_ForLoop27 {
	/*
	 * Given are n line segments with lengths a, b, and c. Write an algorithm and a
	 * program to test whether the given line segments can construct a triangle, and
	 * if they can, calculate the area of the triangle using the formula:
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		/* Declare the line segments */
		double a, b, c;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value of n: ");
		int n = Integer.parseInt(ulaz.readLine());
		for (int i = 1; i <= n; i++) {
			// Input the data
			System.out.print("Enter the length of the line segment a: ");
			a = Double.parseDouble(ulaz.readLine());
			System.out.print("Enter the length of the line segment b: ");
			b = Double.parseDouble(ulaz.readLine());
			System.out.print("Enter the length of the line segment c: ");
			c = Double.parseDouble(ulaz.readLine());
			if (a > 0 && b > 0 && c > 0) {
				/* Conditional structure */
				if ((a + b > c) && (a + c > b) && (b + c > a)) {
					double p = 0.25 * Math.sqrt((a + b + c) * (b + c - a) * (a + c - b) * (a + b - c));
					/* Print the result */
					System.out.println("The area of the triangle is " + p);
				} else
					System.out.println("The input segments do not form a triangle.");
			} else {
				System.out.println("Enter positive values for the line segments!");
			}
		}

	}
}
