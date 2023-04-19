package BranchingStructureSwitchCase_05;

import java.util.Scanner;

//@author Milica Jaric

public class Task99_SwitchCase7 {
/*
 * Write a program that prints how many days February has based on the entered year.
 */
	public static void main(String[] args) {
		 /* Declare variables */
	    int year;
		Scanner sc = new Scanner(System.in);

	    /* Data input */
	    System.out.println("Enter a year: ");
	    year = sc.nextInt();

	    /* Data processing */
	    if (year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0) {
	        System.out.println("February: 29 days");
	    } else {
	        System.out.println("February: 28 days");
	    }

	    sc.close();
	}

}
