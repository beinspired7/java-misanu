package ConditionalStructure_04;

import java.util.Scanner;

//@author Milica Jaric

public class Task72_SmallestNumber {
/*
 * Write a program that finds the smallest number among three input numbers a, b, and c.    }
 */
	public static void main(String[] args) {
		        // Variable declaration
		        double a, b, c, min;
		    
		        // Input data
		        Scanner input = new Scanner(System.in);
		        System.out.println("Enter value for a: ");
		        a = input.nextDouble();
		        System.out.println("Enter value for b: ");
		        b = input.nextDouble();
		        System.out.println("Enter value for c: ");
		        c = input.nextDouble();
		    
		        
		        // Calculation
		        min = a;
		    
		        // Case when the same numbers are entered for a, b and c
		        if (min == b && min == c)
		            System.out.println("There is no smallest number because all entered numbers are the same!");
		        else {
		            if (min > b)
		            min = b;
		            if (min > c)
		            min = c;
		            // Print result
		            System.out.println("The smallest number is: " + min);
		        }
		        input.close();
	}

}
