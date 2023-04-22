package Methods_12;
//@author Milica Jaric

import java.util.Scanner;

public class Task266_Methods13 {
	// Recursive method definition
	public static int fibonacciRecursive(int n) {
		// base case
		if (n == 0 || n == 1)
			return 1;
		// recursive step
		else {
			int n1 = fibonacciRecursive(n - 1);
			int n2 = fibonacciRecursive(n - 2);
			return n1 + n2;
		}
	}

	// Iterative method definition using dynamic programming principle
	public static int fibonacciIterative(int n) {
		// array for storing first n+1 Fibonacci numbers because indices start at 0.
		int fibonacci[] = new int[n + 1];

		// the 0th element of the array is initialized to 1
		fibonacci[0] = 1;

		// if n is greater than or equal to 1, initialize the first element to 1
		if (n >= 1)
			fibonacci[1] = 1;
		// for each i, 2 <= i <= n, apply the recursive formula
		for (int i = 2; i < n + 1; i++)
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];

		// the nth member of the Fibonacci sequence is
		// element fibonacci[n] of the generated array
		return fibonacci[n];
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Number for which the nth member of the Fibonacci sequence is calculated
		int n;
		System.out.print("Enter a negative integer " + " - negative to end: ");

		while ((n = input.nextInt()) >= 0) {
			// Recursive version
			long startTime = System.nanoTime();
			int fibonacciR = Task266_Methods13.fibonacciRecursive(n);
			long endTime = System.nanoTime();
			System.out.println("Recursive version:");
			System.out.println("Fibonacci(" + n + ") = " + fibonacciR);
			System.out.println("Time: " + (endTime - startTime) + "ns");
			startTime = System.nanoTime();
			int fibonacciI = Task266_Methods13.fibonacciIterative(n);
			endTime = System.nanoTime();
			System.out.println("Iterative version:");
			System.out.println("Fibonacci(" + n + ") = " + fibonacciI);
			System.out.println("Time: " + (endTime - startTime) + "ns");
			System.out.print("Enter a negative integer " + " - negative to end: ");
		}
		input.close();
	}
}