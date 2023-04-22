package Methods_12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//@author Milica Jaric

public class Task271_Methods18 {
	/*
	 * Write a method to determine whether a year is a leap year or not. In the main
	 * program, input a year and check whether it is a leap year or not. For
	 * example, the year 1972 is a leap year.
	 * 
	 * Explanation: A year is a leap year if it is divisible by 4 (every fourth year
	 * is a leap year) and not divisible by 100 (every hundredth year is not a leap
	 * year) or divisible by 400 (every 400th year is a leap year).
	 */

	public class Metode16 {
	public static void leapYear(int year) {
	// Checking if the year is a leap year or not
	if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
	System.out.println("Year " + year + " is a leap year.");
	else
	System.out.println("Year " + year + " is not a leap year.");
	}


	public static void main(String[] args) throws Exception {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a year: ");
	int year = Integer.parseInt(input.readLine());
	leapYear(year);
	}
	}

}
