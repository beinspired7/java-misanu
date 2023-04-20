package OnedimensionalArrays_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

//@author Milica Jaric

public class Task204_WhileLoop24 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double[] arrayA = new double[100];
        double[] x = new double[100];
        double[] y = new double[100];
        double a = 0.0, xt = 0.0, yt = 0.0;
    
        DecimalFormat df = new DecimalFormat("#.###");
    
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    
    // Input array size
        System.out.println("Enter the number of array elements: ");
        int n = Integer.parseInt(input.readLine());
    
    // Input array elements a
        System.out.println("Enter the elements of array a: ");
	}

}
