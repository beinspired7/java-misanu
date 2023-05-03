package org.functional.OnedimensionalArrays_10;

import java.util.Scanner;

//@author Milica Jaric

public class Task185_WhileLoop07 {
/*
 * Write a program that prints the sum of the elements in an array X of N elements whose units digit is 5.
 * 
    Explanation:
    x = {125, 236, 105, 658}
    125 + 105 = 230        
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    
        System.out.println("Enter the number of array elements n: ");
        int n = input.nextInt();
    
        int x[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < x.length; i++) {
            System.out.print("x[" + i + "] = ");
            x[i] = input.nextInt();
        }
    
        int sum = 0;
        for (int i = 0; i < x.length; i++)
            if (x[i] % 10 == 5)
            sum += x[i];
    
        System.out.println("The sum is " + sum);
	}

}
