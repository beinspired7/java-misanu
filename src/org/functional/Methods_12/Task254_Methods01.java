package org.functional.Methods_12;
//@author Milica Jaric

public class Task254_Methods01 {
	/*
	 * Write a method for calculating the square of an integer. In the main program,
	 * call this method with a parameter of 10.
	 */
	public class Methods01 {
		public static int squareNumber(int x) {
			return x * x;
		}

		public static void main(String[] args) {
			int x = 10;
			System.out.println("The square of " + x + " is " + squareNumber(x));
		}

	}
}