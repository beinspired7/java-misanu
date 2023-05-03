package org.functional.ConditionalStructureIfElse_04;
//@author Milica Jaric

import java.util.Scanner;


public class Task70_Null {
/*
 * Write a program that calculates z according to the expression for the entered values of a and b, and handles division by zero.
 */
	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
	        System.out.print("Enter the value for a: ");
	        int a = input.nextInt();
	        System.out.print("Enter the value for b: ");
	        int b = input.nextInt();
	        if (b != 0)
	            System.out.println(a / b);
	        else
	            System.out.println("Division by zero");
	        input.close();
	}

}
