package org.functional.OnedimensionalArrays_10;
//@author Milica Jaric

import java.util.Scanner;

public class Task179_WhileLoop2 {
	/*
	 * Zadatak 179: (JDN02)
	 * 
	 * Napisati program kojim se izračunava proizvod članova niza X od N elemenata
	 * čija je vrednost u intervalu [3, 9].
	 * 
	 * Objašnjenje: x = {1, 7, -6, 5, 2} [3, 9] = {7, 5} 7 * 5 = 35
	 * 
	 */
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.print("Unesite broj članova niza n: ");
		int n = ulaz.nextInt();
		int x[] = new int[n];
		System.out.println("Unesite članove niza:");
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = ulaz.nextInt();
		}
		int p = 1;
		for (int i = 0; i < x.length; i++)
			if (x[i] >= 3 && x[i] <= 9)
				p *= x[i];
		System.out.println("P = " + p);
	}

}
