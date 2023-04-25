package TwoDimensionalArrays_11;

import java.util.Scanner;

//@author Milica Jaric

public class Task232_DDN11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Broj redova: ");
		int red = sc.nextInt();

		System.out.println("Broj kolona: ");
		int kolona = sc.nextInt();

		int niz[][] = new int[red][kolona];

		System.out.println("Elementi matrice: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.println("a[" + i + ", " + j + "]" + " = ");
				niz[i][j] = sc.nextInt();
			}
		}

		// Print elements Two Dimensional Arrays:
		System.out.println("Izgled niza: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}

		// Print elements

		System.out.println("Elements: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if ((i + 1) % 2 == 0 && (j + 1) % 2 == 0) {
					System.out.print(niz[i][j] + " ");
				}
			}
			System.out.println();

		}
	}
}
