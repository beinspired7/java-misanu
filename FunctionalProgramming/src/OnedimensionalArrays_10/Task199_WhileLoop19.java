package OnedimensionalArrays_10;

import java.util.Scanner;

//@author Milica Jaric

public class Task199_WhileLoop19 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);

		System.out.println("Enter the number of members n in the array: ");
		int n = ulaz.nextInt();

		double x[] = new double[n];
		double y[] = new double[n];
		System.out.println("Enter the members of array x:");
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = ulaz.nextDouble();
		}

		System.out.println("Enter the members of array y:");
		for (int i = 0; i < y.length; i++) {
			System.out.print("y[" + i + "] = ");
			y[i] = ulaz.nextDouble();
		}

		double f;
		for (int i = 0; i < x.length; i++) {
			f = (x[i] + y[i]) * (x[i] - y[i]);

			System.out.println("For " + x[i] + " and " + y[i] + " f = " + f);
		}

	}
}
