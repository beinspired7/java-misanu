package org.functional.OnedimensionalArrays_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Milica Jaric

public class Task206_WhileLoop26 {
/*
 * Write an algorithm and a program that sorts the elements of array A in ascending order. 
 * The number of elements in array A is N. 
 * Print array A before and after sorting.
            
 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] a = new int[100];
        
        BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
    
    // Input the array size
        System.out.println("Unesite broj elemenata n niza a:");
        int n = Integer.parseInt(ulaz.readLine());
    
    // Input the elements of the array A
        System.out.println("Unesite elemente niza a: ");
        for (int i = 1; i <= n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = Integer.parseInt(ulaz.readLine());
        }
    
    // Print array A before sorting
        System.out.println("Niz a pre sortiranja: ");
        for (int i = 1; i <= n; i++)
            System.out.print(a[i] + "");
	}

}
