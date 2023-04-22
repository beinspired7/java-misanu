package Methods_12;
//@author Milica Jaric

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task286_Methods34 {
/*
 * 	Write a method to calculate the real root of the equation

	f(x) = x - cosx + 0.15 = 0,

	with an error of e <= 10-5 using the iterative formula

	x0 = 0.65,
	xi+1 = cosxi - 0.15, (i = 0,1...).

	Print the result in the following format:
 */

	public class Metode30 {
	public static void calculateRoot(double x0, double eps) {
	int i = 0;

	// Print header
	System.out.println("I X(I) F(X(I))");
	System.out.println("------------------------------------");

	double x1 = Math.cos(x0) - 0.15;

	System.out.println(i + "\t" + x0 + "\t" + x1);

	while (Math.abs(x1 - x0) > eps) {
	    i++;
	    x0 = x1;
	    x1 = Math.cos(x0) - 0.15;

	    // Print result
	    System.out.println(i + "\t" + x0 + "\t" + x1);
	}
	}

	public static void main(String[] args) throws Exception {
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Enter the value for x0: ");
	double x0 = Double.parseDouble(input.readLine());
	System.out.println("Enter the value for eps: ");
	double eps = Double.parseDouble(input.readLine());

	calculateRoot(x0, eps);
	}
}
}