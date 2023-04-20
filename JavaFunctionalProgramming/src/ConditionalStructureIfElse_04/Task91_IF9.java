package ConditionalStructureIfElse_04;
//@author Milica Jaric

import java.util.Scanner;

public class Task91_IF9 {
	/*
	 * Write a program that represents a grading scale.
	 * 
	 * from 0 to 49 - grade 1
	 * 
	 * from 50 to 60 - grade 2
	 * 
	 * from 61 to 69 - grade 3
	 * 
	 * from 70 to 80 - grade 4
	 * 
	 * above 81 is grade 5
	 * 
	 */
	public static void main(String[] args) {

		/* Variable declaration */
		int bodovi;
		Scanner sc = new Scanner(System.in);

		/* Input data */
		System.out.println("Unesite ocenu: ");
		bodovi = sc.nextInt();

		/* Processing */
		if (bodovi < 0) {
			System.out.println("Invalid input.");
		} else if (bodovi >= 0 && bodovi < 50) {
			System.out.println("Grade is 1");
		} else if (bodovi >= 50 && bodovi < 60) {
			System.out.println("Grade is 2");
		} else if (bodovi >= 61 && bodovi < 70) {
			System.out.println("Grade is 3");
		} else if (bodovi >= 71 && bodovi < 80) {
			System.out.println("Grade is 4");
		} else if (bodovi >= 81 && bodovi <= 100) {
			System.out.println("Grade is 5");
		} else {
			System.out.println("You cannot earn over 100 points!");
		}
		sc.close();
	}
}
