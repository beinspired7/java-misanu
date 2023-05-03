package org.functional.Methods_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Milica Jaric

public class Task255_Methods02 {
	/*
	 * Write a method for printing and calculating the average value of an array of
	 * n elements. In the main program, print the value of the array and calculate
	 * the average value.
	 * 
	 */
	public class Methods02 {
		static void printArray(int n, double[] arr) {
			System.out.println("The entered elements of the array are: ");
			for (int i = 0; i < n; i++)
				System.out.println(arr[i] + "\t");
		}

		static double averageValue(int n, double[] arr) {
			double avg = 0;
			for (int i = 0; i < n; i++)
				avg += arr[i];
			return avg / n;
		}

		public static void main(String[] args) throws NumberFormatException, IOException {
			double[] arr = new double[10];
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter the size of the array: ");
			int n = Integer.parseInt(input.readLine());
			System.out.println("Enter the elements of the array: ");
			for (int i = 0; i < n; i++) {
				System.out.print("arr[" + i + "] = ");
				arr[i] = Double.parseDouble(input.readLine());
			}
			printArray(n, arr);
			System.out.println("\nThe average value of the array is " + averageValue(n, arr));
		}

	}
}
