package Methods_12;
//@author Milica Jaric

import java.text.DecimalFormat;

public class Task260_Methods07 {

	/*
	 * Create an algorithm and write a program to table the values of the function
	 * 
	 * y = f(2g(f(x)))
	 * 
	 * for x = 0.1(0.1)0.9, where
	 * 
	 * f(x) = 2x - ln(x), g(x) = tan(x/2) + |x|
	 * 
	 * Print the output list in the form
	 * 
	 * X Y x.xx xx.xxxx
	 * 
	 * Note: Use methods to calculate functions f and g.
	 * 
	 */

	public class Metode06b {
		static double f(double x) {
			return 2 * x - log(x);
		}

		private static double log(double x) {
			// TODO Auto-generated method stub
			return 0;
		}

		static double g(double x) {
			return tan(x / 2.) + abs(x);
		}

		private static int tan(double d) {
			// TODO Auto-generated method stub
			return 0;
		}

		private static int abs(double x) {
			// TODO Auto-generated method stub
			return 0;
		}

		public static void main(String[] args) {
			DecimalFormat df = new DecimalFormat("###,##0.00");
			double x, y;
			System.out.println("\tX\tY");
			for (x = 0.1; x <= 0.9; x += 0.1) {
				y = f(2 * g(f(x)));
				System.out.println("\t" + df.format(x) + "\t" + df.format(y));
			}
		}
	}

}
