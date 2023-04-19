package LoopStructuresDoWhileWhileLoop_08;

import java.text.DecimalFormat;

//@author Milica Jaric

public class Task147_WhileLoop08 {
/*
        
 */
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
        double x0 = 18.0;
        double x1 = 30.0 / (x0 * x0) - 42.0 / x0 + 18.0;
    // Loop structure
        while (Math.abs(x1 - x0) > 1.0E-5) {
            x0 = x1;
            x1 = 30.0 / (x0 * x0) - 42.0 / x0 + 18.0;
        }
    // Printing the result
        System.out.println("The obtained value is x = " + df.format(x1));
    // Another way ... more correct
        boolean check = true;
        x0 = 18.0;
        x1 = 0.0;
    // Loop structure
        while (check) {
            x1 = 30.0 / (x0 * x0) - 42.0 / x0 + 18.0;
            check = Math.abs(x1 - x0) > 1.0E-5;
            x0 = x1;
        }
    // Printing the result
        System.out.println("The obtained value is x = " + df.format(x1));
	}

}
