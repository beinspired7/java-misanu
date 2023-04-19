package BranchingStructureNestedIF1_06;

import java.util.Scanner;

//@author Milica Jaric

public class Task101_NestedIF2 {
	/*
	 * For the entered driver's license category, print which type of vehicle can be
	 * driven. (IFELSE).}
	 */
	public static void main(String[] args) {
		char category;

		// 1. algorithm part: Data input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the category: ");
		category = sc.nextLine().charAt(0);
		sc.close();

		// 2. algorithm part: Data processing
		if (category == 'A' || category == 'a') {
			System.out.println("You can drive a Motorcycle.");
		} else if (category == 'B' || category == 'b') {
			System.out.println("You can drive a Car.");
		} else if (category == 'C' || category == 'c') {
			System.out.println("You can drive a Car and a Truck.");
		} else if (category == 'D' || category == 'd') {
			System.out.println("You can drive a Bus, a Truck and a Car.");
		} else if (category == 'E' || category == 'e') {
			System.out.println("You can drive a Car, a Truck and a Bus.");
		} else {
			System.out.println("Invalid input!");
		}
	}

}
