package OnedimensionalArrays_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Milica Jaric

public class Task212_WhileLoop32 {
	/*
	 * 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		double[] f = new double[1001];

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number n: ");
		int n = Integer.parseInt(ulaz.readLine());

		f[0] = 0;
		f[1] = 1;

		for (int i = 2; i <= n; i++)
			f[i] = 3 * f[i - 1] - 2 * f[i - 2] + f[i - 1] * f[i - 2];

		System.out.println("F(" + n + ") = " + f[n]);
	}

}
