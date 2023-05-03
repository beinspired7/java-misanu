package org.functional.LoopStructures_07;

import java.util.Scanner;

//@author Milica Jaric

public class Task129_ForLoop25 {
/*
 * Write a program that prints the square root of a for n input values of a, or its square if it's negative.
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter the value for n: ");
	    int n = input.nextInt();
	    for (int i = 1; i <= n; i++) {
	        System.out.print("Enter the value of a: ");
	        double a = input.nextDouble();
	        double y;
	        if (a > 0)
	        y = Math.sqrt(a);
	        else
	        y = a * a;
	        System.out.println("For the entered value of a = " + a + ", the value of y = " + y);
	    }
	    input.close();
	}

}
