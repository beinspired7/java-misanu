package org.functional.OnedimensionalArrays_10;

import java.util.Scanner;

//@author Milica Jaric

public class Task200_WhileLoop20 {
/*
 * Write a program that prints the product of the largest digits of the members of array X with N elements.
        
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array n: ");
        int n = input.nextInt();
    
        int x[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < x.length; i++) {
            System.out.print("x[" + i + "] = ");
            x[i] = input.nextInt();
        }
    
        int digit, p = 1;
        for (int i = 0; i < x.length; i++) {
            int max = 0, a = x[i];
            while (a != 0) {
            digit = a % 10;
            if (digit > max)
                max = digit;
    
            a /= 10;
            }
            p *= max;
            System.out.println("The largest digit of the member " + x[i] + " is " + max);
        }
    
        System.out.println(p);
	}

}
