package LinearStructures_01;
//@author Milica Jaric

import java.util.Scanner;

/*
 *		Write an algorithm and program to convert length given in inches to centimeters, if 1 inch = 2.54 cm. Print the diagonal length of a 26-inch television in centimeters.
 
 */
public class LinearStructure8 {

	public static void main(String[] args) {

		// n - diagonal screen size expressed in inches
		double n;
		Scanner input = new Scanner(System.in);
		// Input diagonal screen size expressed in inches
		System.out.print("Enter the diagonal screen size in inches: ");
		n = input.nextDouble();
		// Printing the result
		System.out.println("Diagonal screen size expressed in centimeters " + n * 2.54);
	}

}
