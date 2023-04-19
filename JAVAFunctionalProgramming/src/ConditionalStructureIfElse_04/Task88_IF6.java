package ConditionalStructureIfElse_04;
//@author Milica Jaric

import java.util.Scanner;

public class Task88_IF6 {
	/*
	 * Write a program that calculates y for a given x using the following formula:
	 */
	public static void main(String[] args) {
		/* Declaring variables */
		double x, y;
		Scanner sc = new Scanner(System.in);

		/* Input x */
		System.out.println("Enter a value for x: ");
		x = sc.nextDouble();

		/* Conditional structure */
		if (x < 0) {
			y = -1;
		} else if (x == 0) {
			y = 0;
		} else {
			y = +1;
		}

		/* Output */
		System.out.println("The value of y is " + y);
		sc.close();
	}

}
