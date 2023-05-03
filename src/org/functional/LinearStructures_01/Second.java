package org.functional.LinearStructures_01;
//@author Milica Jaric

import java.util.Scanner;

/*
 * Write a program that takes the time input in hours, minutes, and seconds and calculates and converts it to seconds.
 */
public class Second {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the hours: ");
		int h = input.nextInt();
		System.out.print("Enter the minutes: ");
		int m = input.nextInt();
		System.out.print("Enter the seconds: ");
		int sec = input.nextInt();
		System.out.print("The time expressed in seconds is: " + (h * 3600 + m * 60 + sec));

		input.close();
	}

}
