package org.functional.OnedimensionalArrays_10;
//@author Milica Jaric

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Task214_WhileLoop34 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double[] x = new double[100];
	    
        DecimalFormat df = new DecimalFormat("#.###");
    
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    
    // Enter the data for a and n
        System.out.println("Enter the value for a: ");
        double a = Double.parseDouble(input.readLine());
        System.out.println("Enter the number of elements in array x:");
        int n = Integer.parseInt(input.readLine());
    
    // Enter the elements of array x
        System.out.println("Enter the elements of array x: ");
        for (int i = 1; i <= n; i++) {
            System.out.print("x[" + i + "] = ");
            x[i] = Double.parseDouble(input.readLine());
        }
    
    // Calculation of continued fraction
        double ver = n * Math.sqrt(a);
        for (int i = n - 1; i >= 1; i--)
            ver = i * Math.sqrt(a) + (x[i] - x[i + 1]) / ver;
    
    // Print the result 
        System.out.println("The value of the continued fraction is " + df.format(ver));
	}

}
