package ConditionalStructure_04;
//@author Milica Jaric

import java.util.Scanner;

/*
 * Write a program that inputs a natural number a, and if it is odd, it outputs its reciprocal value, and if it is even, it outputs the square of its predecessor.

	Solution description: The task can be described using the following formula.
 */
public class Task63_EvenNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int a;
		double y;
		System.out.println("Enter the value of number a: ");
		a = input.nextInt();
		if (a % 2 != 0)
			y = (double) 1 / a;
		else
			y = (a - 1) * (a - 1);
		System.out.println("y is " + y);

		input.close();
	}
}
