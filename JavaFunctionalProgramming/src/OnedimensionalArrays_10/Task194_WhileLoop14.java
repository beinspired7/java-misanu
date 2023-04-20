package OnedimensionalArrays_10;
//@author Milica Jaric

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Task194_WhileLoop14 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		 double[] laguerrePolynomial = new double[100];
		    
	        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	        DecimalFormat df = new DecimalFormat("#.###");
	    
	        System.out.println("Enter a value for x: ");
	        double x = Double.parseDouble(input.readLine());
	    
	        laguerrePolynomial[0] = 1;
	        laguerrePolynomial[1] = 1 - x;
	    
	        
	        for (int n = 1; n <= 9; n++)
	        	laguerrePolynomial[n + 1] = (2 * n - 1 - x) * laguerrePolynomial[n] - n * n * laguerrePolynomial[n - 1];
        
            for (int n = 0; n <= 9; n++)
                System.out.println("L(" + n + ") = " + df.format(laguerrePolynomial[n]));

	}

}
