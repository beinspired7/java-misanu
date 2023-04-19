package LinearStructures_01;
//@author Milica Jaric

import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * 			Write an algorithm and a program that calculates the value of a function shown in the image based on the input values of variables x, y, and z. Print the value of the function on the output.

 */
public class LinearStructure3 {

	public static void main(String[] args) {

		// Declaring variables
		double x, y, z, f;
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner ulaz = new Scanner(System.in);
		// Input data
		System.out.print("Enter the value for x: ");
		x = ulaz.nextDouble();
		System.out.print("Enter the value for y: ");
		y = ulaz.nextDouble();
		System.out.print("Enter the value for z: ");
		z = ulaz.nextDouble();
		// Calculate the value of the function f
		f = (x + y) * (x + z) * Math.sin(x) / (2 * x - y);
		// Print the result
		System.out.println("The value of the function f is " + df.format(f));
	}

}
