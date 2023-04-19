package BranchingStructureNestedIF1_06;

import java.util.Scanner;

//@author Milica Jaric

public class Task104_NestedIF5 {
	/*
	 * Write a program that allows you to enter the name of the month and the number
	 * of days to output the zodiac sign.
	 * 
	 * Enter the month of birth: October Enter the day of birth: 18
	 */
	public static void main(String[] args) {

		// Declaration of variables
		String month = "", horoscopeSign = "";
		int day, signNumber = 0;

		Scanner sc = new Scanner(System.in);

		// 1st part of the algorithm: Input data
		System.out.println("Enter the month of birth: ");
		month = sc.nextLine();
		System.out.println("Enter the day of birth: ");
		day = sc.nextInt();
		sc.close(); // closing the scanner to prevent "data leakage"

		/* 2nd part of the algorithm: Data processing */
		if (month.equalsIgnoreCase("January")) {
			signNumber = 1;
		} else if (month.equalsIgnoreCase("February")) {
			signNumber = 2;
		} else if (month.equalsIgnoreCase("March")) {
			signNumber = 3;
		} else if (month.equalsIgnoreCase("April")) {
			signNumber = 4;
		} else if (month.equalsIgnoreCase("May")) {
			signNumber = 5;
		} else if (month.equalsIgnoreCase("June")) {
			signNumber = 6;
		} else if (month.equalsIgnoreCase("July")) {
			signNumber = 7;
		} else if (month.equalsIgnoreCase("August")) {
			signNumber = 8;
		} else if (month.equalsIgnoreCase("September")) {
			signNumber = 9;
		} else if (month.equalsIgnoreCase("October")) {
			signNumber = 10;
		} else if (month.equalsIgnoreCase("November")) {
			signNumber = 11;
		} else if (month.equalsIgnoreCase("December")) {
			signNumber = 12;
		}

		// Check if the entered day is within the range of 1 to 31
		if (day >= 1 && day <= 31) {
			/*
			 * Switch statement that determines the zodiac sign based on the entered month
			 * and day
			 */
			switch (signNumber) {
			case 1:
				if (day >= 1 && day <= 19) {
					horoscopeSign = "Capricorn";
				} else if (day >= 20 && day <= 31) {
					horoscopeSign = "Aquarius";
				}
				break;
			case 2:
				if (day >= 1 && day <= 18) {
					horoscopeSign = "Aquarius";
				} else if (day >= 19 && day <= 29) {
					horoscopeSign = "Pisces";
				}
				break;
			case 3:
				if (day >= 1 && day <= 20) {
					horoscopeSign = "Pisces";
				} else if (day >= 21 && day <= 31) {
					horoscopeSign = "Aries";
				}
				break;
			case 4:
				if (day >= 1 && day <= 19) {
					horoscopeSign = "Aries";
				} else if (day >= 20 && day <= 30) {
					horoscopeSign = "Taurus";
				}
				break;
			case 5:
				if (day >= 1 && day <= 20) {
					horoscopeSign = "Taurus";
				} else if (day >= 21 && day <= 31) {
					horoscopeSign = "Gemini";
				}
				break;
			case 6:
				if (day >= 1 && day <= 21) {
					horoscopeSign = "Gemini";
				} else if (day >= 22 && day <= 30) {
					horoscopeSign = "Cancer";
				}
				break;
			case 7:
				if (day >= 1 && day <= 22) {
					horoscopeSign = "Cancer";
				} else if (day >= 23 && day <= 31) {
					horoscopeSign = "Leo";
				}
				break;
			case 8:
				if (day >= 1 && day <= 22) {
					horoscopeSign = "Leo";
				} else if (day >= 23 && day <= 31) {
					horoscopeSign = "Virgo";
				}
				break;
			case 9:
				if (day >= 1 && day <= 22) {
					horoscopeSign = "Virgo";
				} else if (day >= 23 && day <= 30) {
					horoscopeSign = "Libra";
				}
				break;
			case 10:
				if (day >= 1 && day <= 23) {
					horoscopeSign = "Libra";
				} else if (day >= 24 && day <= 31) {
					horoscopeSign = "Scorpio";
				}
				break;
			case 11:
				if (day >= 1 && day <= 22) {
					horoscopeSign = "Scorpio";
				} else if (day >= 23 && day <= 30) {
					horoscopeSign = "Sagittarius";
				}
				break;
			case 12:
				if (day >= 1 && day <= 21) {
					horoscopeSign = "Sagittarius";
				} else if (day >= 22 && day <= 31) {
					horoscopeSign = "Capricorn";
				}
				break;
			}
		} else {
			// Warning message for unexpected input
			System.out.println("Invalid input!");
		}
		// Step 3 of the algorithm: Printing the horoscope sign
		System.out.println("Horoscope sign: " + horoscopeSign);
	}

}
