package OnedimensionalArrays_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Milica Jaric

public class Task210_WhileLoop30 {
	/*
	 * A postman is walking down a street and needs to distribute packages. He
	 * decided to first visit one side of the street (where houses with even numbers
	 * are located), and then on the way back, visit the other side of the street
	 * (where houses with odd numbers are located). Write a program that determines
	 * which houses are on the even and which on the odd side of the street, given
	 * their house numbers.
	 * 
	
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// Array of even and odd numbers and their current lengths
		int[] even = new int[100];
		int[] odd = new int[100];
		int e = 0, o = 0;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		// Read the number of elements
		System.out.println("Enter a value for k: ");
		int k = Integer.parseInt(input.readLine());

		for (int i = 1; i <= k; i++) {
			// Read the next element
			int x = Integer.parseInt(input.readLine());
			if (x % 2 == 0) // if it's even
				even[e++] = x; // store it in the even array
			else // otherwise
				odd[o++] = x;
		}

		System.out.println("Even house numbers:");
		for (int i = 0; i < e; i++)
			System.out.println(even[i]);

		System.out.println("Odd house numbers:");
		for (int i = 0; i < o; i++)
			System.out.println(odd[i]);
	}

}
