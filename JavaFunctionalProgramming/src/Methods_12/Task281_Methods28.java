package Methods_12;
//@author Milica Jaric

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task281_Methods28 {
	/*
	 * Write a method named "sila" for calculating the force of attraction between
	 * two charged particles q1 and q2 at a distance r, given by the formula
	 * 
	 * f = k * q1 * q2 / r2,
	 * 
	 * where k = 9 * 109 Nm2/C2. Calculate the force F for charges and distance
	 * provided as input (q1 = 3 * 106C, q2= 3.7 * 106C, r = 104m).
	 * 
	 */
	public class Metode24 {
		static final double k = 9 * Math.pow(10, 9);

		// sila - method for calculating the force of attraction between two charged
		// particles
		// q1, q2 - charges of particles
		// r - distance between particles
		public static double sila(double q1, double q2, double r) {
			return k * q1 * q2 / (r * r);
		}

		public static void main(String[] args) throws Exception {
			// Data declaration
			double q1, q2, r;

			BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
			// Input data
			System.out.println("Enter the value of the first charge q1 (C): ");
			System.out.print("q1 = ");
			q1 = Double.parseDouble(ulaz.readLine());
			System.out.println("Enter the value of the second charge q2 (C): ");
			System.out.print("q2 = ");
			q2 = Double.parseDouble(ulaz.readLine());
			System.out.print("Enter the value for distance r (m): ");
			r = Double.parseDouble(ulaz.readLine());

			// Printing the result
			System.out.println("For q1 = " + q1 + " C, q2 = " + q2 + " C and distance r = " + r
					+ " m, the force is F = " + sila(q1, q2, r) + " N.");
		}
	}

}
