package org.functional.OnedimensionalArrays_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// @author Milica Jaric

public class Task190_WhileLoop11b {
/*
 * Write a program that finds the maximum element and its index in an integer vector X of N elements.
       
 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		 int[] x = new int[100];
		    
	        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	    
	        System.out.println("Enter the number of elements N in vector X:");
	        int n = Integer.parseInt(input.readLine());
	    
	        System.out.println("Enter the elements of vector X: ");
	        for (int i = 1; i <= n; i++) {
	            System.out.print("X[" + i + "] = ");
	            x[i] = Integer.parseInt(input.readLine());
	        }
	    
	        int imax = 1;
	        for (int i = 2; i <= n; i++)
	            if (x[i] > x[imax])
	            imax = i;
	    
	        System.out.println("The index of the maximum element ( " + x[imax] + " ) is " + imax);
	}

}
