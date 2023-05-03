package org.functional.Methods_12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

//@author Milica Jaric


public class Task289_Methods36 {
    public static double[] coefficientAB(double x[], double y[], int n) {
    double s1 = 0, s2 = 0, s3 = 0, s4 = 0;
    double[] coefficient = new double[5];
    for (int i = 1; i <= n; i++) {
        s1 += x[i];
        s2 += y[i];
        s3 += x[i] * y[i];
        s4 += x[i] * x[i];
    }

    // Calculation of coefficient a
    coefficient[1] = (s1 * s2 - n * s3) / (s1 * s1 - n * s4);

    // Calculation of coefficient b
    coefficient[2] = (s2 - coefficient[1] * s1) / n;

    return coefficient;
    }

    public static void main(String[] args) throws Exception {
    double[] x = new double[100];
    double[] y = new double[100];

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    DecimalFormat df = new DecimalFormat("#.##");

    System.out.println("Enter a value for n: ");
    int n = Integer.parseInt(input.readLine());

    for (int i = 1; i <= n; i++) {
        System.out.println(i + ". point ");
        System.out.print("x[" + i + "] = ");
        x[i] = Double.parseDouble(input.readLine());
        System.out.print("y[" + i + "] = ");
        y[i] = Double.parseDouble(input.readLine());
    }

    System.out.println(
        "a = " + df.format(coefficientAB(x, y, n)[1]) + "\tb = " + df.format(coefficientAB(x, y, n)[2]));
    }
}    