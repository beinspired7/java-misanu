package Methods_12;
//@author Milica Jaric


public class Task258_Methods05 {

	/*
	 * Write a method for recursively calculating the factorial of a number.
	 * Explanation: The factorial of a number (n!) can be calculated recursively,
	 * since for n = 0, 0! = 1, and for n>0, n! = n * (n-1)!. Thus, all values can
	 * be calculated using the recursive rule:
	 * 
	 * 1! = 1 * 0! = 1 2! = 2 * 1! = 2 3! = 3 * 2! = 6 ... etc.
	 * 
	 * 
	 */

	public class Metode05 {
		static int faktorijel(int n) {
			if (n == 0)
				return 1;
			else
				return faktorijel(n - 1) * n;
		}

		public static void main(String[] args) {
			System.out.println("Faktorijel broja 5 je " + faktorijel(5));

		}
	}
}