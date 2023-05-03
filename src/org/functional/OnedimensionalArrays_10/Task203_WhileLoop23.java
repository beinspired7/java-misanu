package org.functional.OnedimensionalArrays_10;

import java.util.Scanner;

//@author Milica Jaric

public class Task203_WhileLoop23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    
        double x[] = new double[100];
        double y[] = new double[100];
        char region[] = new char[100];
    
        System.out.println("Enter the number of points n: ");
        int n = input.nextInt();
    
        System.out.println("Enter the coordinates of points x and y:");
        for (int i = 1; i <= n; i++) {
            System.out.print("x[" + i + "] = ");
            x[i] = input.nextDouble();
            System.out.print("y[" + i + "] = ");
            y[i] = input.nextDouble();
    
            boolean k1 = Math.pow(x[i] - 1, 2) + Math.pow(y[i], 2) <= 1;
            boolean k2 = Math.pow(x[i] - 2, 2) + Math.pow(y[i], 2) <= 1;
    
            if (k1 && !k2)
            region[i] = '1';
            else if (k1 && k2)
            region[i] = '2';
            else if (!k1 && k2)
            region[i] = '3';
            else
            region[i] = '*';
        }
    
        System.out.println("NO.\tX\tY\tREGION");
        for (int i = 1; i <= n; i++)
            System.out.println(i + "\t" + x[i] + "\t" + y[i] + "\t" + region[i]);
	}

}
