package OnedimensionalArrays_10;
//@author Milica Jaric

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task216_WhileLoop36 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number n: ");
		int n = Integer.parseInt(input.readLine());

		double sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter data #" + i + ": ");
			System.out.print("a = ");
			a[i] = Double.parseDouble(input.readLine());
			System.out.print("b = ");
			b[i] = Double.parseDouble(input.readLine());
			System.out.print("c = ");
			c[i] = Double.parseDouble(input.readLine());

			if (a[i] + b[i] > c[i])
				sum += a[i] * a[i] + b[i] * b[i] + c[i] * c[i];
			else if (a[i] + b[i] == c[i])
				sum += a[i] + 2 * b[i] * c[i];
			else
				sum += a[i] + b[i] - c[i];
		}

		System.out.println("The sum of " + n + " terms is: \n S = " + sum);
	}

}
