package OnedimensionalArrays_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Milica Jaric

public class Task196_WhileLoop16 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] a = new int[100];
        int[] b = new int[100];
    
        BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
    
        System.out.println("Enter a value for k: ");
        int k = Integer.parseInt(ulaz.readLine());
    
        System.out.println("Enter a value for a[0]: ");
        a[0] = Integer.parseInt(ulaz.readLine());
        System.out.println("Enter a value for b[0]: ");
        b[0] = Integer.parseInt(ulaz.readLine());
    
        for (int i = 1; i <= k; i++) {
            a[i] = a[i - 1] + b[i - 1];
            b[i] = a[i - 1] * b[i - 1];
        }
    
        System.out.println("a[" + k + "] = " + a[k] + "\t b[" + k + "] = " + b[k]);
	}

}
