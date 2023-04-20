package OnedimensionalArrays_10;

import java.util.Scanner;

//@author Milica Jaric

public class Task181_JDB04a {
	/*
	 * Write a program that calculates and prints the product of the X array members
	 * of N elements that are not divisible by 4.
	 * 
	 * css Copy code Explanation: x = {1, 4, 8, 3, 6} P = 1 * 3 * 6 = 18
	 */

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array n: ");
		int n = ulaz.nextInt();
		int x[] = new int[n];
		System.out.println("Enter the array members:");
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = ulaz.nextInt();
		}
		int p = 1;
		for (int i = 0; i < x.length; i++)
			if (x[i] % 4 != 0)
				p *= x[i];
		System.out.println("P = " + p);
	}
}
