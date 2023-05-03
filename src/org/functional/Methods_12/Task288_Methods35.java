package org.functional.Methods_12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
//@author Milica Jaric


public class Task288_Methods35 {
public static double coefficientR(double x[], double y[], int n) {
double s1 = 0, s2 = 0, s3 = 0, s4 = 0, s5 = 0;
for (int i = 1; i <= n; i++) {
s1 += x[i] * y[i];
s2 += x[i];
s3 += y[i];
s4 += x[i] * x[i];
s5 += y[i] * y[i];
}

// Calculation of coefficient R
return (n * s1 - s2 * s3) / Math.sqrt((n * s4 - s2 * s2) * (n * s5 - s3 * s3));
}

	public static void main(String[] args) throws Exception {
		double[] x = new double[100];
		double[] y = new double[100];

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.##");

		System.out.println("Enter the value for n: ");
		int n = Integer.parseInt(input.readLine());

		for (int i = 1; i <= n; i++) {
			System.out.println(i + ". point ");
			System.out.print("x[" + i + "] = ");
			x[i] = Double.parseDouble(input.readLine());
			System.out.print("y[" + i + "] = ");
			y[i] = Double.parseDouble(input.readLine());
		}

		System.out.println("r = " + df.format(coefficientR(x, y, n)));
	}
}