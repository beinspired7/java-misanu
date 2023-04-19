package ConditionalStructureIfElse_04;
//@author Milica Jaric

import java.util.Scanner;

/*
		Write a program that calculates z for given real values a and b according to the following expression:

 */
public class Task67_ArithmeticExpression {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		double a = input.nextDouble();
		System.out.print("Enter the value of b: ");
		double b = input.nextDouble();
		double z;
		if (a > b)
			z = 2 * a + b;
		else
			z = a - 2 * b;
		System.out.println("z = " + z);
		input.close();
	}

}
