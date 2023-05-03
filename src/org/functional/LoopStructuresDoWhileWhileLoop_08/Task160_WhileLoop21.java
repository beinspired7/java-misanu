package org.functional.LoopStructuresDoWhileWhileLoop_08;

import java.text.DecimalFormat;
import java.util.Scanner;

//@author Milica Jaric

public class Task160_WhileLoop21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		int n, a;
		double eps;
		System.out.println("Enter value for n:");
		n = input.nextInt();
		System.out.println("Enter value for a:");
		a = input.nextInt();
		System.out.println("Enter value for epsilon:");
		eps = input.nextDouble();
		double x0 = (a + n - 1) / n;
		double x1 = ((n - 1) * x0 + a / Math.pow(x0, n - 1)) / n;

		while (Math.abs(x1 - x0) > eps) {
			x0 = x1;
			x1 = ((n - 1) * x0 + a / Math.pow(x0, n - 1)) / n;

		}
		System.out.println("The obtained value is x = " + df.format(x1));

	}
}
