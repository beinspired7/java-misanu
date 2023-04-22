package Methods_12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//@author Milica Jaric

public class Task267_Methods14 {
/*
 * 	Write an algorithm and a method that calculates the value of f according to the formula for given values of x, y, and z:
		f = max(x, min(y,z)).
		Enter values for x, y, and z in the main program and print the result.

	
 */

		public class Methods12 {
		// Defining the function
		static int f(int x, int y, int z) {
		int f = (y < z) ? y : z;
		if (x > f)
		f = x;
		return f;
		}


		public static void main(String[] args) throws Exception {
		// Declaring data
		int x, y, z;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		// Input data
		System.out.print("Enter the value for x: ");
		x = Integer.parseInt(input.readLine());
		System.out.print("Enter the value for y: ");
		y = Integer.parseInt(input.readLine());
		System.out.print("Enter the value for z: ");
		z = Integer.parseInt(input.readLine());
		// Print the result
		System.out.println("The value of the expression f is " + f(x, y, z));
		}
		}
}
