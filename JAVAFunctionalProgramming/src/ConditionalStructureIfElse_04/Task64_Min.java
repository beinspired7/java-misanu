package ConditionalStructureIfElse_04;
//@author Milica Jaric

import java.util.Scanner;

/*
 * Write a program that calculates y according to the formula for the entered values of a and b:
 */
public class Task64_Min {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int a, b;
		int y;
		System.out.println("Enter the value of a: ");
		a = input.nextInt();
		System.out.println("Enter the value of b: ");
		b = input.nextInt();
		if (a >= 0)
			y = Math.min(a, b);
		else
			y = 2 * Math.min(a, b);
		System.out.println("y is " + y);

		input.close();
	}

}
