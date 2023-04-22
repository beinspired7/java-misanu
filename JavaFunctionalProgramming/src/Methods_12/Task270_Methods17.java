package Methods_12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

//@author Milica Jaric

public class Task270_Methods17 {

	// Defining function y
	static double y(int n, double x, double[] a) {
		double s = 0, p;

		for (int i = 1; i <= n; i++) {
			p = 1;
			for (int j = 1; j <= n; j++)
				if (i != j)
					p *= x - a[j];
			s += p;
		}
		return s;
	}

	public static void main(String[] args) throws Exception {
		double[] a = new double[100];

		DecimalFormat df = new DecimalFormat("#.###");

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		// Input the size of the array
		System.out.println("Enter the size n of array a: ");
		int n = Integer.parseInt(ulaz.readLine());

		// Input the elements of the array
		System.out.println("Enter the elements of array a: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = Double.parseDouble(ulaz.readLine());
		}

		// Printing the result
		System.out.println("\tN = " + n + "\tX\tY");
		for (double x = 0.0; x <= 1.0; x += 0.1)
			System.out.println("\t\t" + df.format(x) + "\t\t" + df.format(y(n, x, a)));
	}
}
