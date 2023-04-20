package BranchingStructureSwitchCase_05;

import java.util.Scanner;

//@author Milica Jaric

public class Task98_SwitchCase6 {
	/*
	 * If three natural numbers k1, k2, k3 are entered from the input, which
	 * represent the ordinal number of the day in the year, check if they represent
	 * the same day of the week. For example, the same day is represented by: 2, 16,
	 * and 30 or 344, 351, and 358.
	 */
	public static void main(String[] args) {
		int k1, k2, k3, boolToInt;
		boolean i;

		/* Part 1: Data Input */
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a value for k1: ");
		k1 = input.nextInt();
		System.out.println("Enter a value for k2: ");
		k2 = input.nextInt();
		System.out.println("Enter a value for k3: ");
		k3 = input.nextInt();

		i = ((k2 - k1) % 7 == 0 && (k3 - k1) % 7 == 0);

		boolToInt = i ? 1 : 0;

		/* Part 2: Data Processing with Switch */
		System.out.println("Solution with SWITCH:");
		switch (boolToInt) {
		case 1:
			System.out.println("The same day of the week!");
			break;
		case 0:
			System.out.println("Not the same day of the week!");
			break;
		default:
			System.out.println("Wrong input!");
		}

		/* Part 2: Data Processing with If/Else */
		System.out.println("\nSolution with If/Else:");
		if ((k2 - k1) % 7 == 0 && (k3 - k1) % 7 == 0) {
			System.out.println("The same day of the week!");
		} else {
			System.out.println("Not the same day of the week!");
		}
		input.close();

	}

}
