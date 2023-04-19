package LoopStructuresDoWhileWhileLoop_08;

import java.util.Scanner;

//@author Milica Jaric

public class Task166_WhileLoop27 {
/*
 * Write a program that calculates the sum of:
 * 
 * 𝑆 = 1! / k + 2! / k2 + 3! / k3 + ... + n! / kn
 * 
 * for given values of n and k.
 * 
 */
	public static void main(String[] args) {
		 Scanner ulaz = new Scanner(System.in);
		    System.out.println("Enter a value for n:");
		    int n = ulaz.nextInt();
		    System.out.println("Enter a value for k:");
		    int k = ulaz.nextInt();
		    double s = 0, p = 1, p1 = 1;
		    int i = 1;
		    while (i <= n) {
		        p *= i; // factorial of i
		        p1 *= k; // k raised to the power of i
		        s += p / p1;
		        i++;
		    }
		    System.out.println("Sum s = " + s);
	}

}
