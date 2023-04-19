package ConditionalStructureIfElse_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Milica Jaric

public class Task81_IfStructure {
	/*
	 * Create an algorithm and write a program to calculate the value of a function
	 * with the given values of x, y, p, and q.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a value for x: ");
		int x = Integer.parseInt(input.readLine());
		System.out.print("Enter a value for y: ");
		int y = Integer.parseInt(input.readLine());
		System.out.print("Enter a value for p: ");
		int p = Integer.parseInt(input.readLine());
		System.out.print("Enter a value for q: ");
		int q = Integer.parseInt(input.readLine());
		int f = (p < q) ? p : q;
		if (y > f)
			f = y;
		if (x < f)
			f = x;
		System.out.println("The value of the function f is " + f);
	}

}
