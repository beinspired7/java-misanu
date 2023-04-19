package LinearStructures_01;
//@author Milica Jaric

import java.util.Scanner;

/*
 * Create an algorithm and write a program to calculate the sum of significant digits of any three-digit number entered at the input. 
 * //Print the required sum at the output.
 */
public class LineStructure7 {

	public static void main(String[] args) {

		// n - three-digit number
		// s - hundreds digit
		// d - tens digit
		// j - units digit
		// zbir - sum of digits of the three-digit number
		int n, s, d, j, zbir;
		Scanner input = new Scanner(System.in);
		// Input the three-digit number
		System.out.print("Enter a three-digit number n: ");
		n = input.nextInt();
		// Finding the digits of the three-digit number
		s = n / 100;
		d = (n - s * 100) / 10;
		j = n - s * 100 - d * 10;
		// Calculating the sum of digits of the three-digit number
		zbir = s + d + j;
		// Printing the results
		System.out.println("The sum of digits of the three-digit number " + n + " is " + zbir);
	}

}
