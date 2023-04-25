package Methods_12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

//@author Milica Jaric

public class Task274_Methods21 {
	/*
	 * Task 274:
	 * 
	 * The distance between two points in a plane is determined by the formula d =
	 * Math.sqrt(x1 - x2)2 + (y1 - y2)2, where (x1, y1) and (x2, y2) are the
	 * coordinates of the first and second points, respectively. Using this formula,
	 * write an algorithm and a program that calculates the distance from the origin
	 * of each of the N points, whose coordinates are read in order. Define the
	 * relation that determines the distance between two points in the plane by the
	 * method. The output list should be:
	 * 
	 * markdown Copy code R.BR. X Y RASTOJANJE xxx x.xx x.xx xxx.xxx
	 */

	public class Methods18 {
		// Defining the distance function
		static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		}

		public static void main(String[] args) throws Exception {
		double[] x = new double[100];
		double[] y = new double[100];

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.##");
		// Entering the number of points
		System.out.println("Enter a value for n: ");
		int n = Integer.parseInt(input.readLine());

		// Entering the coordinates of the point
		System.out.println("Enter the coordinates of the point: ");
		for (int i = 1; i <= n; i++) {
		System.out.println(i + ". point ");
		System.out.print("x = ");
		x[i] = Double.parseDouble(input.readLine());
		System.out.print("y = ");
		y[i] = Double.parseDouble(input.readLine());
		} // Printing header
		System.out.println("\tR.BR.\tX\tY\tDistance");

		// Printing results
		for (int i = 1; i <= n; i++)
		System.out.println("\t" + i + "\t" + df.format(x[i]) + "\t" + df.format(y[i]) + "\t"
		+ df.format(distance(0, 0, x[i], y[i])));
		}
		}
}
