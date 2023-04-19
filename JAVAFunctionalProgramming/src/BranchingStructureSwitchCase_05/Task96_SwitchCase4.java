package BranchingStructureSwitchCase_05;

import java.text.DecimalFormat;
import java.util.Scanner;

//@author Milica Jaric

public class Task96_SwitchCase4 {
	/*
	 * Write a program that finds the equivalent capacitance of two capacitors with
	 * capacitance C1 = 10nF and C2 = 15nF if they are connected:
	 * 
	 * a) In series b) In parallel
	 * 
	 * Solution: The equivalent capacitance of a series connection is calculated
	 * using the formula Ce = C1 * C2 / (C1 + C2), and for a parallel connection,
	 * the formula is Ce = C1 + C2.
	 */
	public static void main(String[] args) {
		double c1, c2;
		String connection;

		/* 1. part: Data entry */
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the type of connection, 'Series' or 'Parallel': ");
		connection = input.nextLine();
		System.out.println("Enter the value for C1: ");
		c1 = input.nextInt();
		System.out.println("Enter the value for C2: ");
		c2 = input.nextInt();

		/* 2. part: Data processing with IF-ELSE */
		if (connection.equalsIgnoreCase("Series")) {
			System.out.println("Equivalent capacitance of a series connection: " + df.format(c1 * c2 / (c1 + c2)));
		} else if (connection.equalsIgnoreCase("Parallel")) {
			System.out.println("Equivalent capacitance of a parallel connection: " + df.format((c1 + c2)));
		} else {
			System.out.println("Invalid input!");
		}

		input.close();
	}

}
