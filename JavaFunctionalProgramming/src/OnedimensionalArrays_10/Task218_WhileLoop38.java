package OnedimensionalArrays_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Milica Jaric

public class Task218_WhileLoop38 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
	    
        // Creating an array x of real numbers
        double[] x = new double[100];
    
        // Input the value of variable n
        System.out.print("Enter the number of elements n of array x: ");
        int n = Integer.parseInt(ulaz.readLine());
    
        // Input the elements of array x
        System.out.println("Enter the elements of array x: ");
        for (int i = 1; i <= n; i++) {
            System.out.print("x[" + i + "] = ");
            x[i] = Double.parseDouble(ulaz.readLine());
        }
    
        // Calculate the arithmetic mean of x
        double xsr = 0;
        for (int i = 1; i <= n; i++)
            xsr += x[i];
    
        xsr /= n;
    
        // Calculate the variance of x
        double v = 0;
        for (int i = 1; i <= n; i++)
            v += (x[i] - xsr) * (x[i] - xsr);
    
        v /= (n - 1);
    
        System.out.print("V = " + v);
	}

}
