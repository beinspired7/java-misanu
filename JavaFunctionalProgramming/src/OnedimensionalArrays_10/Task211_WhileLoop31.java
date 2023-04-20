package OnedimensionalArrays_10;
//@author Milica Jaric

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task211_WhileLoop31 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double[] b = new double[100];
		double[] h = new double[100];
		double[] L = new double[100];

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of rods m: ");
		int m = Integer.parseInt(ulaz.readLine());

		System.out.println("Enter the dimensions of the cross-section b and h and the length of the rod L: ");
		for (int i = 1; i <= m; i++) {
			System.out.println("Rod " + i + ": ");
			System.out.print("b = ");
			b[i] = Double.parseDouble(ulaz.readLine());
			System.out.print("h = ");
			h[i] = Double.parseDouble(ulaz.readLine());
			System.out.print("L = ");
			L[i] = Double.parseDouble(ulaz.readLine());
		}

		System.out.println("\tb\th\tL\ttenuity ");

		for (int i = 1; i <= m; i++) {
			double Imin = Math.pow(b[i], 3) * h[i] / 12;
			double f = b[i] * h[i];
			double imin = Math.sqrt(Imin / f);
			double tenuity = L[i] / imin;

			if (tenuity > 50)
				System.out.println("\t" + b[i] + "\t" + h[i] + "\t" + L[i] + "\t" + tenuity);

		}

	}
}
