package BranchingStructureNestedIF1_06;
//@author Milica Jaric

import java.util.Scanner;

public class Task102_NestedIF3 {
	/*
	 * For the entered driver's license category, print which type of vehicle can be
	 * driven. (SWITCH-CASE)
	 * 
	 */
	public static void main(String[] args) {

		char n;

		// 1. part of the algorithm: Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the category: ");
		n = sc.nextLine().charAt(0);
		sc.close();

		// 2. part of the algorithm: Data processing
		switch (n) {
		case 'A':
		case 'a':
			System.out.println("You can drive a Motorcycle.");
			break;
		case 'B':
		case 'b':
			System.out.println("You can drive a Car.");
			break;
		case 'C':
		case 'c':
			System.out.println("You can drive a Car and a Truck.");
			break;
		case 'D':
		case 'd':
			System.out.println("You can drive a Bus, Truck and Car.");
			break;
		case 'E':
		case 'e':
			System.out.println("You can drive a Car, Truck and Bus.");
			break;
		default:
			System.out.println("Invalid input!");

		}

	}

}
