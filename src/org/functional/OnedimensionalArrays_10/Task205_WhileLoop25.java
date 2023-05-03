package org.functional.OnedimensionalArrays_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

//@author Milica Jaric

public class Task205_WhileLoop25 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double[] nizA = new double[100];
		double[] x = new double[100];
		double[] y = new double[100];
		double a = 0.0, xt = 0.0, yt = 0.0;

		DecimalFormat df = new DecimalFormat("#.###");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite broj elemenata nizova: ");
		int n = Integer.parseInt(ulaz.readLine());

		System.out.println("Unesite elemente niza a, x, y: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("a[" + i + "] = ");
			nizA[i] = Double.parseDouble(ulaz.readLine());
			System.out.print("x[" + i + "] = ");
			x[i] = Double.parseDouble(ulaz.readLine());
			System.out.print("y[" + i + "] = ");
			y[i] = Double.parseDouble(ulaz.readLine());

			a += nizA[i];
			xt += nizA[i] * x[i];
			yt += nizA[i] * y[i];
		}
		xt /= a;
		yt /= a;

		// Printing the result
		System.out.println("A = " + df.format(a) + "\nXT = " + df.format(xt) + "\nYT = " + df.format(yt));
	}

}
