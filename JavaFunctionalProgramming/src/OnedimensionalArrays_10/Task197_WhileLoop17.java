package OnedimensionalArrays_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Milica Jaric

public class Task197_WhileLoop17 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double[] f = new double[1001];
		double s;
		int i, n, broj;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a number between 1 and 1000: ");
		broj = Integer.parseInt(ulaz.readLine());

		if (broj < 1 || broj > 1000)
			System.out.println("Error.");
		else {
			f[1] = 0.5;
			for (n = 2; n <= broj; n++) {
				s = 0;
				for (i = 1; i <= n - 1; i++)
					s += f[i] * f[n - i];

				f[n] = s;
			}

			System.out.println("F(" + broj + ") = " + f[broj]);
		}
	}
}