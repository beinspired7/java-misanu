package ConditionalStructure_04;
//@author Milica Jaric

import java.util.Scanner;

public class Task90_IF8 {
/*
 * Write a program that determines whether a year is a leap year or not. For example, the year 1972 is a leap year.

Solution: A year is a leap year if it is divisible by 4 (every fourth year is a leap year) and not divisible by 100 (every 100th year is not a leap year) 
or if it is divisible by 400 (every 400th year is a leap year).
 */
	public static void main(String[] args) {
		 /* Variable declaration */
	    int year;
	    Scanner sc = new Scanner(System.in);

	    /* Input data */
	    System.out.println("Enter a year: ");
	    year = sc.nextInt();

	    /* Processing */
	    if (year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0) {
	        System.out.println("The year " + year + " is a leap year.");
	    } else {
	        System.out.println("The year " + year + " is not a leap year.");
	    }

	    sc.close();
	}

}
