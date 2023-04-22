package Methods_12;
//@author Milica Jaric

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Task285_Methods33 {
	public class Methods29 {
		public static double angle(double x1, double x2, double y1, double y2) {
			double x = x2 - x1;
			double y = y2 - y1;

			if (x == 0)
				return 0;
			else
				return Math.atan(y / x);
		}

		public static double distance(double x1, double x2, double y1, double y2) {
			double x = x2 - x1;
			double y = y2 - y1;

			return Math.sqrt((x * x) + (y * y));
		}

		public static void main(String[] args) throws Exception {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			DecimalFormat df = new DecimalFormat("###.##");
			// Data input
			System.out.println("Enter the coordinate x1: ");
			double x1 = Double.parseDouble(input.readLine());
			System.out.println("Enter the coordinate y1: ");
			double y1 = Double.parseDouble(input.readLine());
			System.out.println("Enter the coordinate x2: ");
			double x2 = Double.parseDouble(input.readLine());
			System.out.println("Enter the coordinate y2: ");
			double y2 = Double.parseDouble(input.readLine());

			// Printing results
			System.out.println("Directional angle: " + df.format(angle(x1, x2, y1, y2)) + "\nDistance: "
					+ df.format(distance(x1, x2, y1, y2)));
		}
	}
}
