package BranchingStructureSwitchCase_05;

import java.util.Scanner;

//@author Milica Jaric

public class Task93_SwitchCase1 {
	/*
	 * Write a program that prints the name of the day for a given day of the week.
	 */
	public static void main(String[] args) {
		int dayOfWeek;

		/* Part 1: Input */

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the day of the week number: ");
		dayOfWeek = input.nextInt();

		/* Part 2: Processing */
		switch (dayOfWeek) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Error");

		}

		input.close();
	}

}
