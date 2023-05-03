package org.functional.OnedimensionalArrays_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Milica Jaric

public class Task207_WhileLoop27 {
/*
 * Write an algorithm and a program that sorts the elements of an array A in non-ascending order. 
 * The number of elements in array A is N. Print the array A before and after sorting.
 *            
 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		 int[] a = new int[100];
		    
         BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
 
         // Input array size
         System.out.println("Enter the number of elements in array A:");
         int n = Integer.parseInt(ulaz.readLine());
 
         // Input array elements
         System.out.println("Enter the elements of array A:");
         for (int i = 1; i <= n; i++) {
             System.out.print("a[" + i + "] = ");
             a[i] = Integer.parseInt(ulaz.readLine());
         }
 
         // Print array before sorting
         System.out.println("Array A before sorting: ");
         for (int i = 1; i <= n; i++)
             System.out.print(a[i] + " ");
 
         // Sorting array elements
         for (int i = 1; i <= n - 1; i++)
             for (int j = i + 1; j <= n; j++) {
                 if (a[i] <= a[j]) {
                     // Swap array elements
                     int pom = a[i];
                     a[i] = a[j];
                     a[j] = pom;
                 }
             }
 
         // Print array after sorting
         System.out.println("\nArray A after sorting: ");
         for (int i = 1; i <= n; i++)
             System.out.print(a[i] + " ");
	}

}
