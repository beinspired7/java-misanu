package OnedimensionalArrays_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Milica Jaric

public class Task187_WhileLoop09 {
/*
 * Create an algorithm and write a program to calculate the standard deviation. 
 * The value of n and the array xi, i = 1, ..., n, are entered at the input.       
 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		double[] x = new double[100];
        double s, s1 = 0, s2 = 0;
    
        BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
    
        // Input array size
        System.out.println("Enter the number of elements n in array x:");
        int n = Integer.parseInt(ulaz.readLine());
    
        // Input array elements
        System.out.println("Enter the elements of array x:");
        for (int i = 1; i <= n; i++) {
            System.out.print("x[" + i + "] = ");
            x[i] = Double.parseDouble(ulaz.readLine());
        }
    
        // Calculating corresponding sums 
        for (int i = 1; i <= n; i++) {
            s1 += x[i] * x[i];
            s2 += x[i];
        }
        //Calculating standard deviation 
        s = Math.sqrt(s1 / n - Math.pow(s2 / n, 2));
    
        //Printing the result 
        System.out.println("The standard deviation is " + s);
	}

}
