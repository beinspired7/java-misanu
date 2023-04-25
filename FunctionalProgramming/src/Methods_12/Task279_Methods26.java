package Methods_12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//@author Milica Jaric

public class Task279_Methods26 {
	/*
	 * Write a method to recursively calculate the factorial of a number.
	 * 
	 * Explanation: The factorial of a number (n!) can be calculated recursively
	 * because for n = 0, 0! = 1, and for n>0, n! = n * (n-1)!. Thus, all values can
	 * be calculated using the recursive rule:
	 * 
	 * 1! = 1 * 0! = 1 2! = 2 * 1! = 2 3! = 3 * 2! = 6 ... and so on.
	 * 
	 * 
	 */
	public class Methods23 {
		static int factorial(int n) {
			if (n == 0)
				return 1;
			else
				return factorial(n - 1) * n;
		}

		public static void main(String[] args) throws Exception {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the value for m: ");
			int m = Integer.parseInt(input.readLine());
			System.out.println("Enter the value for n: ");
			int n = Integer.parseInt(input.readLine());

			int result;
			if (m > n)
				result = factorial(m - n);
			else if (m == n)
				result = factorial(m);
			else
				result = factorial(n - m);

			System.out.println("For the entered values m = " + m + " and n = " + n + ", the result is " + result);
		}
	}
}
