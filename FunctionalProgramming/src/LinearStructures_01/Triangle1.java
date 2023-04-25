package LinearStructures_01;
//@author Milica Jaric

import java.util.Scanner;

/*
 * 
		Write a program that assigns the value true to the boolean variable p, if a triangle can be constructed from line segments with lengths x, y, and z.

		Solution description: p = (x + y > z) && (x + z > y) && (y + z > x)
 */
public class Triangle1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the side x of the triangle: ");
		int x = input.nextInt();
		System.out.print("Enter the length of the side y of the triangle: ");
		int y = input.nextInt();
		System.out.print("Enter the length of the side z of the triangle: ");
		int z = input.nextInt();
		boolean p = (x + y > z) && (x + z > y) && (y + z > x);
		System.out.println("p = " + p);
		input.close();
	}

}
