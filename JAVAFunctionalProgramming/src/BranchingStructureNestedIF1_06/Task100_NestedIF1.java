package BranchingStructureNestedIF1_06;

import java.util.Scanner;

//@author Milica Jaric

public class Task100_NestedIF1 {
	/*
	 * For three entered numbers, print the highest number.
	 */
	public static void main(String[] args) {
		int highestNumber;
		// 1. algorithm part: Data input
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();

		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();

		System.out.println("Enter the third number: ");
		int num3 = sc.nextInt();
		sc.close();
		// 2. algorithm part: Data processing
		if (num1 > num2) {
			if (num1 > num3) {
				highestNumber = num1;
			} else {
				highestNumber = num3;
			}
		} else {
			if (num2 > num3) {
				highestNumber = num2;
			} else {
				highestNumber = num3;
			}
		}

		// 3. algorithm part: Printing the result
		System.out.println("The highest of the entered numbers is: " + highestNumber);
	}

}
