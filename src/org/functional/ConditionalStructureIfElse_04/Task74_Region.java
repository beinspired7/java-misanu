package org.functional.ConditionalStructureIfElse_04;

import java.util.Scanner;

//@author Milica Jaric

public class Task74_Region {
/*
 * Write a program that checks whether the entered point is inside the rectangle.
 */
	public static void main(String[] args) {
	     Scanner input = new Scanner(System.in);
	        System.out.print("Enter x-coordinate of point: ");
	        double x = input.nextDouble();
	        System.out.print("Enter y-coordinate of point: ");
	        double y = input.nextDouble();
	        System.out.print("Enter x-coordinate of rectangle point 1: ");
	        double x1 = input.nextDouble();
	        System.out.print("Enter x-coordinate of rectangle point 2: ");
	        double x2 = input.nextDouble();
	        System.out.print("Enter y-coordinate of rectangle point 1: ");
	        double y1 = input.nextDouble();
	        System.out.print("Enter y-coordinate of rectangle point 2: ");
	        double y2 = input.nextDouble();
	        if ((x > x1) && (x < x2) && (y > y1) && (y < y2))
	            System.out.print("The point is inside the rectangle.");
	        else
	            System.out.print("The point is not inside the rectangle.");
	    
	        input.close();
	}

}
