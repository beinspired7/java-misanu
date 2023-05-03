package org.functional.ConditionalStructureIfElse_04;
//@author Milica Jaric

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task71_LargestNumber {
/*
 * Write a program that finds the largest number among three entered numbers a, b, and c.
 */
	public static void main(String[] args) {
		  // Declare variables
        double a = 0, b = 0, c = 0, max;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        // Input data
        System.out.println("Enter a:");
        try {
			a = Double.parseDouble(input.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Enter b:");
        try {
			b = Double.parseDouble(input.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Enter c:");
        try {
			c = Double.parseDouble(input.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // Calculation
        max = a;
        // Case when all entered numbers are the same
        if (max == b && max == c)
            System.out.println("There is no largest number because all numbers are the same!");

        else {
            if (max < b)
                max = b;
            if (max < c)
                max = c;
            // Print the largest number of the entered ones
            System.out.println("The largest number is: " + max);
        }
	}

}
