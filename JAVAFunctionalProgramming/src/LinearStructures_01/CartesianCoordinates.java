package LinearStructures_01;
//@author Milica Jaric

import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

//Create an algorithm and write a program to calculate the Cartesian coordinates of a force of intensity F = 6kN, if the angle α = 60° between the force F and the coordinate axis. Print the values of the Cartesian coordinates at the output.

//The Cartesian coordinates of force F on the coordinate axis are determined by expressions:
//X = F * cos α
//Y = F * sin α

public class CartesianCoordinates {

	public static void main(String[] args) {

		// f - intensity of the force
		// alpha - angle between force F and coordinate axis
		// x, y - Cartesian coordinates
		double f, alpha, x, y;
		DecimalFormat df = new DecimalFormat("#.##");
		// Input data
		Scanner ulaz = new Scanner(System.in);
		System.out.print("Enter the value for the intensity of the force F (kN): ");
		f = ulaz.nextDouble();
		System.out.print("Enter the value for the angle alpha in degrees: ");
		alpha = ulaz.nextDouble();
		// Calculation of the value of Cartesian coordinates
		x = f * Math.cos(alpha);
		y = f * Math.sin(alpha);
		// Printing the result
		System.out.println("The values of Cartesian coordinates are: X=" + df.format(x) + "\tY=" + df.format(y));

	}

}
