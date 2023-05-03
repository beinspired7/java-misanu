package org.functional.BranchingStructureSwitchCase_05;

import java.util.Scanner;

//@author Milica Jaric

public class Task94_SwitchCase2 {
	/*
	 * Write a program that, for the entered character, prints whether it is a vowel
	 * or a consonant.
	 */
	public static void main(String[] args) {
		char karakter;

		/* 1. part: Input */

		Scanner ulaz = new Scanner(System.in);

		System.out.println("Enter a letter: ");
		karakter = ulaz.next().charAt(0);

		/* 2. part: Data processing */

		if (karakter >= 'a' && karakter <= 'z' || karakter >= 'A' && karakter <= 'Z') {

			switch (karakter) {
			case 'a':
			case 'A':
				System.out.println("Vowel.");
				break;
			case 'e':
			case 'E':
				System.out.println("Vowel.");
				break;
			case 'i':
			case 'I':
				System.out.println("Vowel.");
				break;
			case 'o':
			case 'O':
				System.out.println("Vowel.");
				break;
			case 'u':
			case 'U':
				System.out.println("Vowel.");
				break;
			default:
				System.out.println("Consonant!");

			}
			ulaz.close();

		} else

		{
			System.out
					.println("Enter a lowercase or uppercase letter.\nSpecial characters or numbers are not allowed!");
		}

	}

}
