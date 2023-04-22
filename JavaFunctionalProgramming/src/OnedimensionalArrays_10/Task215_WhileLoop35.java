package OnedimensionalArrays_10;
//@author Milica Jaric

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Task215_WhileLoop35 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double[] x = new double[100];
		double eps = 1.0E-5;

		DecimalFormat df = new DecimalFormat("#.###");

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		// Enter the size of array x
		System.out.println("Enter the number of elements in array x:");
		int n = Integer.parseInt(input.readLine());

		// Enter the elements of array x
		System.out.println("Enter the elements of array x: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = Double.parseDouble(input.readLine());
		}

		// Print header
		System.out.println("\tI\tX\tS(X(I))");

		for (int i = 1; i <= n; i++) {
			// Calculation of the value of the sum
			int k = 1;
			double s = (Math.abs(Math.sin(x[i] / k) - Math.pow(Math.cos(x[i]), 2))) / (k * k + 1);

			while (Math.abs(s) <= eps) {
				k++;
				s += (Math.abs(Math.sin(x[i] / k) - Math.pow(Math.cos(x[i]), 2))) / (k * k + 1);
			}

			// Print the result
			System.out.println("\t" + i + "\t" + df.format(x[i]) + "\t" + df.format(s));
		}

	}
}
