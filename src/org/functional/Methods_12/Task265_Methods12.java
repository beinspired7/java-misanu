package org.functional.Methods_12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//@author Milica Jaric

public class Task265_Methods12 {
	public class Metode11a { // Defining the recursive function
		public static int fibonaci(int i) {
			if (i <= 1)
				return i;
			else
				return fibonaci(i - 1) + fibonaci(i - 2);
		}

		public static void main(String[] args) throws Exception {
			BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in)); // Input of n
			System.out.print("Enter n = ");
			int n = Integer.parseInt(ulaz.readLine()); // Printing Fibonacci numbers
			for (int i = 1; i <= n; i++)
				System.out.print(fibonaci(i - 1) + " ");
		}
	}
}
