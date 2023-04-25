package OnedimensionalArrays_10;
//@author Milica Jaric

public class Task191_WhileLoop12a {
/*
 * The following integers are given: 25, 31, 12, -7, 14, 24, 121, -35, 42, 15.
Write an algorithm and a program to create two new arrays from this array of numbers.
The first one should contain members of the given array that are divisible by 2, and the second one members that are divisible by 5.
Print out the members of all three arrays.

Explanation:
x = {25, 31, 12, -7, 14, 24, 121, -35, 42, 15} and i = 10
x2 = {12, 14, 24, 42} and i2 = 4
x5 = {25, -35, 15} and i5 = 3 
 */
	public static void main(String[] args) {
		// k - given array of numbers
	    // k2 - array of numbers divisible by 2
	    // k5 - array of numbers divisible by 5
	    // n2 - counter for numbers divisible by 2
	    // n5 - counter for numbers divisible by 5
	        int[] k = { 25, 31, 12, -7, 14, 24, 121, -35, 42, 15 };
	        int[] k2 = new int[100];
	        int[] k5 = new int[100];
	        int n2 = 0, n5 = 0;
	    
	        for (int i = 0; i < 10; i++) {
	    // Checking if the number is divisible by 2
	            if (k[i] % 2 == 0)
	            k2[n2++] = k[i];
	    
	    // Checking if the number is divisible by 5
	            if (k[i] % 5 == 0)
	            k5[n5++] = k[i];
	        }
	    
	    // Printing the results
	        System.out.println("Given array of numbers: ");
	        for (int i = 0; i < 10; i++)
	            System.out.print(k[i] + " ");
	    
	        System.out.println("\nArray of numbers divisible by 2: ");
	        for (int i = 0; i < n2; i++)
	            System.out.print(k2[i] + " ");
	    
	        System.out.println("\nArray of numbers divisible by 5: ");
	        for (int i = 0; i < n5; i++)
	            System.out.print(k5[i] + " ");
	}

}
