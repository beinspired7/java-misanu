package ConditionalStructure_04;
//@author Milica Jaric

import java.util.Scanner;

/*
Write a program that calculates z for given values a and b according to the following expression:
 */
public class Task68_Divisibility {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		int a = input.nextInt();
		System.out.print("Enter the value of b: ");
		int b = input.nextInt();
		int z;
		if (a % 2 == 0 && b % 3 == 0)
			z = a + b;
		else
			z = a - b;
		System.out.println("z = " + z);
		input.close();
	}

}
