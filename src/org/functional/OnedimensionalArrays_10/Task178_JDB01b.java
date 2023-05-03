package org.functional.OnedimensionalArrays_10;

import java.util.Scanner;

//@author Milica Jaric

public class Task178_JDB01b {
/*
 * Write a program that reads and prints the members of an array X with N elements.
 */
	public static void main(String[] args) {

		 Scanner input = new Scanner(System.in);
	        System.out.println("Enter the number of array members N: ");
	        int n = input.nextInt();
	    // Allocating space for an array of n members
	        int x[] = new int[100];
	        System.out.println("Enter the array members:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("x[" + i + "] = ");
	            x[i] = input.nextInt();
	        }
	    // Printing the array members 
	        for (int i = 0; i < n; i++)
	            System.out.println(x[i]);
	}

}
