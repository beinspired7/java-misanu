package LinearStructures;

import java.util.Scanner;

/*
 * Write a program that calculates the value of the function shown in the image based on the entered logical values ​​of the variables x and y. Print the value of the function at the output.
 */
public class LinearStructure10 {

	public static void main(String[] args) {

		// Input: entering logical values ​​of variables x and y
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		boolean x = input.nextBoolean();
		System.out.println("Enter the value of y: ");
		boolean y = input.nextBoolean();

		// Processing: calculation
		boolean z = !(x || y) && !x || y;

		// Output: printing the result
		System.out.println("z = " + z);
		input.close();
	}

}
