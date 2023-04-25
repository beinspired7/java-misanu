package Methods_12;
//@author Milica Jaric

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/*
 * Write a method for calculating Hermite polynomials using the recursive formula Hn+1 = 2 * (x * Hn - n * Hn-1),
where H0 = 1, H1 = x. Name the method H(n, x), where n is the degree of the polynomial and x is the variable.
In the main program, enter the degree of the polynomial and the variable x and call the method.

 */

public class Task284_Methods32 {
	public static double[] h(int n, double x) {
		double[] hermit = new double[10];
		hermit[0] = 1.0;
		hermit[1] = x;

		for (int i = 1; i <= n; i++)
			hermit[i + 1] = 2 * (x * hermit[i] - n * hermit[i - 1]);

		return hermit;
	}

	public static void main(String[] args) throws Exception {
// Declaration of data
		double x;
		int n;
		double[] hermit = new double[10];

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("###,##0.00");

// Input data
		System.out.println("Enter the degree of the polynomial n: ");
		n = Integer.parseInt(input.readLine());
		System.out.println("Enter the value of x: ");
		x = Double.parseDouble(input.readLine());

// Printing header
		System.out.println("Degree \t h[degree] \n======================");

// Call the method for calculating Hermite polynomials
		hermit = h(n, x);

// Printing result
		for (int i = 0; i <= n; i++)
			System.out.println(i + "\t" + df.format(hermit[i]));
	}
}
