package LinearStructures_01;
//@author Milica Jaric

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Create an algorithm and write a program that calculates the surface area and volume of a cube based on the entered side length a.
 * // Print the surface area and volume of the cube at the output.
 */
public class LineStructure6 {

	public static void main(String[] args) {

		// a, b, c - sides of the triangle
		// s - semiperimeter of the triangle
		// p - area of the triangle
		// R - circumradius of the triangle
		// r - inradius of the triangle
		// d - distance between the circumcenter and incenter
		double a, b, c, s, p, R, r, d;
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner input = new Scanner(System.in);
		// Input data
		System.out.print("Enter the value for a: ");
		a = input.nextDouble();
		System.out.print("Enter the value for b: ");
		b = input.nextDouble();
		System.out.print("Enter the value for c: ");
		c = input.nextDouble();
		// Calculating the values
		s = (a + b + c) / 2;
		p = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		R = a * b * c / (4 * p);
		r = a * b * c / (2 * R * s);
		d = Math.sqrt(R * (R - 2 * r));
		// Printing the results
		System.out.println("R = " + df.format(R) + "\tr = " + df.format(r) + "\td = " + df.format(d));
	}
}
