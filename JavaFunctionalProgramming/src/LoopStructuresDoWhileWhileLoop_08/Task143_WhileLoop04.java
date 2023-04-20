package LoopStructuresDoWhileWhileLoop_08;
//@author Milica Jaric

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task143_WhileLoop04 {
	/*
	 * Write a program to print odd numbers from 1 to the given number n.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// Write a program to print odd numbers from 1 to the given number n.
		int n;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a value for n: ");
		n = Integer.parseInt(ulaz.readLine());

		int i = 1;
		while (i <= n) {
			if (i % 2 != 0)
				System.out.println(i);
			i++;
		}
	}

}
