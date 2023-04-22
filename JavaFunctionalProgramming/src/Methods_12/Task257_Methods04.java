package Methods_12;
//@author Milica Jaric

public class Task257_Methods04 {

//Write methods for calculating the sum of two integers and two real numbers. In the main program, call the method for adding two integers 3 and 4 and two real numbers 2.3 and 4.5.

	public class Metode04 {
		public static double sum(double x, double y) {
			return x + y;
		}

		public static int sum(int x, int y) {
			return x + y;
		}

		public static void main(String[] args) {
			double x = 2.3, y = 4.5;
			int a = 3, b = 4;
			System.out.println("Call for data type double: " + sum(x, y));
			System.out.println("Call for data type int: " + sum(a, b));
		}

	}

}
