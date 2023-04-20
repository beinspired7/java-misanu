package OnedimensionalArrays_10;
//@author Milica Jaric

import java.util.Scanner;

public class Task193_WhileLoop13b {
	/*
	 * Write a program that calculates the value of the function f=[𝑥_𝑖, 𝑦_𝑖 ],𝑖=1, …,𝑛 
	 * for given arrays x and y of n elements using the formula shown in
	 * the picture. Print the value of the function at the output.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of array elements n: ");
		int n = input.nextInt();

		double x[] = new double[n];
		double y[] = new double[n];
		System.out.println("Enter the elements of array x:");
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = input.nextDouble();
		}

		System.out.println("Enter the elements of array y:");
		for (int i = 0; i < y.length; i++) {
			System.out.print("y[" + i + "] = ");
			y[i] = input.nextDouble();
		}

		double f;
		for (int i = 0; i < x.length; i++) {
			if (x[i] > y[i])
				f = Math.sqrt((x[i] - 0.2) / (2 + y[i]));
			else
				f = Math.sqrt((y[i] - 0.2) / (2 + x[i]));

			System.out.println("For " + x[i] + " and " + y[i] + " the value of f is " + f);
		}
	}

}
