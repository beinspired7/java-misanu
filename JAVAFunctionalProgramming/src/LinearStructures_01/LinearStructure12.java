package LinearStructures_01;
//@author Milica Jaric

import java.util.Scanner;

/*
 * Create an algorithm and write a program that calculates the surface area and volume of a cuboid based on the entered side lengths. 
 * //Print the surface area and volume of the cuboid at the output.
 */
public class LinearStructure12 {

	public static void main(String[] args) {

		// Declaration of variables
		double a, b, c, area, volume;

		// Input data
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of side a: ");
		a = input.nextDouble();
		System.out.println("Enter the value of side b: ");
		b = input.nextDouble();
		System.out.println("Enter the value of side c: ");
		c = input.nextDouble();

		// Calculating the surface area and volume of the cuboid

		area = 2 * ((a * b) + (a * c) + (b * c));
		volume = a * b * c;

		// Printing the values ​​of the volume and surface area of the cuboid

		System.out.println("The surface area of the cuboid is: " + area + "\nThe volume of the cuboid is: " + volume);
		input.close();
	}

}
