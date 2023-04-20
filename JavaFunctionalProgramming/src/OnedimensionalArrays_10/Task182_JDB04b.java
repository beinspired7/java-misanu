package OnedimensionalArrays_10;
//@author Milica Jaric

import java.util.Scanner;

public class Task182_JDB04b {
	/*
	 * Write a program that calculates and prints the product of the elements of
	 * array X of N elements that are not divisible by 4.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array n: ");
		int n = input.nextInt();
		int x[] = new int[n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = input.nextInt();
		}
		int p = 1;
		for (int i = 0; i < x.length; i++)
			if (x[i] % 4 != 0)
				p *= x[i];
		System.out.println("P = " + p);

	}

}
