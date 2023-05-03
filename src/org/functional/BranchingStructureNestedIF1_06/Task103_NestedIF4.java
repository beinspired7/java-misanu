package org.functional.BranchingStructureNestedIF1_06;

import java.util.Scanner;

//@author Milica Jaric

public class Task103_NestedIF4 {
	/*
	 * Write a program SEVENDAY that determines the date that will be in 7 days for
	 * the entered date. Three positive integers are entered from standard input,
	 * each in a separate line, representing the day, month, and year of a valid
	 * date. On standard output, print three integers representing the day, month,
	 * and year of the date that will occur in 7 days. All numbers are printed on
	 * one line, and a dot is added after each number.
	 */
	public static void main(String[] args) {
		// 0. part: Declaration of variables

		Scanner input = new Scanner(System.in);
		int day, month, year, limit;
		limit = 0;

		// 1. part: Data input
		System.out.println("Enter the day: ");
		day = input.nextInt();
		System.out.println("Enter the month: ");
		month = input.nextInt();
		System.out.println("Enter the year: ");
		year = input.nextInt();
		input.close();

		// 2. part: Data processing
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:

			limit = 31;

			break;
		case 4:
		case 6:
		case 9:
		case 11:

			limit = 30;

			break;

		case 2:
			if (year % 4 == 0) {
				limit = 29;
			} else {
				limit = 28;
			}
			break;

		}
		if (day + 7 > limit) {
			day = day + 7 - limit;
			month = month + 1;

			if (month > 12) {
				month = 1;
				year = year + 1;
			}

		} else {
			day = day + 7;

		}

		// 3. part: Printing the output
		System.out.println("The date that will for 7 days is \"+day + \".\" + month + \".\" + year");
	}

}
