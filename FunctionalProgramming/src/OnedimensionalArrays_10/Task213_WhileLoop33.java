package OnedimensionalArrays_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task213_WhileLoop33 {
	//@author Milica Jaric

	public static void main(String[] args) throws NumberFormatException, IOException {
		double[] a = new double[100];
        double[] b = new double[100];
        double[] c = new double[100];
        double[] x = new double[100];
    
        BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
    
    // Input of n
        System.out.println("Enter the number n: ");
        int n = Integer.parseInt(ulaz.readLine());
    
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ". data input: ");
            System.out.print("a = ");
            a[i] = Double.parseDouble(ulaz.readLine());
            System.out.print("b = ");
            b[i] = Double.parseDouble(ulaz.readLine());
            System.out.print("c = ");
            c[i] = Double.parseDouble(ulaz.readLine());
        }
    
        double s = 0;
        for (int i = 1; i <= n; i++) {
            if (a[i] + b[i] > c[i])
            x[i] = a[i] * a[i] + b[i] * b[i] + c[i] * c[i];
            else if (a[i] + b[i] == c[i])
            x[i] = a[i] + 2 * b[i] * c[i];
            else
            x[i] = a[i] + b[i] - c[i];
            s += x[i];
        }
    
        System.out.println("The sum of " + n + " addends is: \nS = " + s);
	}

}
