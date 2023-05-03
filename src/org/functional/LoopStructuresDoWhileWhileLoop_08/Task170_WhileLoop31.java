package org.functional.LoopStructuresDoWhileWhileLoop_08;

import java.util.Scanner;

//@author Milica Jaric

public class Task170_WhileLoop31 {
	/*
	 * Write a program that reads numbers until the number 5 is entered. Find the
	 * sum of the entered numbers that are divisible by 2 or 7.
	 */
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        System.out.println("Enter a value for a:");
	        int a = input.nextInt();
	        int sum = 0;
	        while (a != 5) {
	            if (a % 2 == 0 || a % 7 == 0)
	            sum += a;
	            System.out.println("Enter a value for a:");
	            a = input.nextInt();
	        }
	        System.out.println("The sum of the entered numbers that are divisible by 2");
	}

}
