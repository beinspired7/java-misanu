package LinearStructures_01;
//@author Milica Jaric

import java.util.Scanner;

/*
 *Write a program that assigns the value true to the boolean variable p if a rectangle with sides a and b can fit entirely into a rectangle with sides c and d.

		Solution description: p = ((a < c) && (b < d)) || ((a < d) && (b < c)) 
 */
public class Rectangle1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the side a of the first rectangle: ");
		int a = input.nextInt();
		System.out.print("Enter the length of the side b of the first rectangle: ");
		int b = input.nextInt();
		System.out.print("Enter the length of the side c of the second rectangle: ");
		int c = input.nextInt();
		System.out.print("Enter the length of the side d of the second rectangle: ");
		int d = input.nextInt();
		boolean p = ((a < c) && (b < d)) || ((a < d) && (b < c));
		System.out.println("p = " + p);
		input.close();
	}

}
