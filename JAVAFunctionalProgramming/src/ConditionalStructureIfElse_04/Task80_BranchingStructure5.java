package ConditionalStructureIfElse_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Milica Jaric

public class Task80_BranchingStructure5 {
	/*
	 * Create an algorithm and write a program to calculate the value of a function
	 * with arguments q, r, and s.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		// Input data
		System.out.print("Enter a value for q: ");
		int q = Integer.parseInt(input.readLine());
		System.out.print("Enter a value for r: ");
		int r = Integer.parseInt(input.readLine());
		System.out.print("Enter a value for s: ");
		int s = Integer.parseInt(input.readLine());
		// Calculate the value of the function
		int y = (r > s) ? r : s;
		if (q < y)
			y = q;
		// Print the result
		System.out.println("The value of the function y is " + y);
	}

}
