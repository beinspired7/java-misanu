package LinearStructures_01;
//@author Milica Jaric

import java.util.Scanner;

//Read the coordinates of two points M1(x1,y1) and M2(x2, y2) and calculate the individual distance of points from the coordinate origin. Description of the solution: The distance of a point from the coordinate origin is the Pythagorean square root of the sum of the squares of the legs. 
//For the point M1(x1, y1), the distance from the coordinate origin is the hypotenuse a12 = x12 + y12, or the square root of the sum of squares. 
//The distance of point M2(x2, y2), hypotenuse a22 = x22 + y22 or the square root of the sum of squares of legs is calculated in the same way.
public class Distance {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the coordinates of the first point: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double a1 = Math.sqrt(x1 * x1 + y1 * y1);
		System.out.println("Enter the coordinates of the second point: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double a2 = Math.sqrt(x2 * x2 + y2 * y2);
		System.out.println("Distance of the first point (" + x1 + "," + y1 + ") from the coordinate origin is " + a1);
		System.out.println("Distance of the second point (" + x2 + "," + y2 + ") from the coordinate origin is " + a2);

		input.close();
	}

}
