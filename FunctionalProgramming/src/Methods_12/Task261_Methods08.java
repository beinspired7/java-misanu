package Methods_12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//@author Milica Jaric

public class Task261_Methods08 {
	/*
	 * 
	 * Create an algorithm and write a method called "sila" to calculate the force
	 * of attraction between two point masses m1 and m2 at a distance r, given by
	 * the formula
	 * 
	 * F = y * m1 * m2 / r2,
	 * 
	 * where y = 6.67 * 10 -11Nm / kg 2. Calculate the force F for the masses and
	 * distance given at the input (m1 = 3 * 10 6kg, m2 = 3.7 * 10 6kg, r = 104m).
	 */

	public class Metode07 {
		// gamma – universal gravitational constant
		static final double GAMA = 6.67 * Math.pow(10, -11);

		// sila - method for calculating the force of attraction between two point
		// masses
		// m1, m2 – masses of the bodies // r – distance between the centers of mass of
		// the bodies
		public static double sila(double m1, double m2, double r) {
			return GAMA * m1 * m2 / (r * r);
		}

	public static void main(String[] args) throws Exception { // Declaration of data
	double m1, m2, r;
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); // Data input
	System.out.println("Enter the values for the masses (kg): ");
	System.out.print("m1 = ");
	m1 = Double.parseDouble(input.readLine());
	System.out.print("m2 = ");
	m2 = Double.parseDouble(input.readLine());
	System.out.print("Enter the value for the distance r (m): ");
	r = Double.parseDouble(input.readLine()); // Print the result
	System.out.println("For m1 = " + m1 + " kg, m2 = " + m2 + " kg i  r = " + r + " m, sila je F = "
	        + sila(m1, m2, r) + " N.");
}
	}
}