package org.functional.LinearStructures_01;
//@author Milica Jaric

import java.util.Scanner;

/*
 * Write a program to extract the digits of a three-digit number.

Solution description: The positional system property is used for conversion.
A three-digit number number = s * 102 + d * 101 + j * 100.
158 = 100 + 50 + 8 = 1 * 102 + 5 * 101 + 8 * 100

The units of the number (in this case a three-digit number) are obtained by the expression number % 10. The hundreds digit is obtained by integer division with 100. The ones digit is the remainder of the division by 10. The first two digits are obtained by integer division with 10, the remainder of which is the tens digit.


 */
public class ThreeDigitNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Three-digit number:");
		int number = input.nextInt();
		int s, d, j;
		s = number / 100; // hundreds digit
		d = (number / 10) % 10; // tens digit
		j = number % 10; // ones digit
		System.out.println(
				"number = " + number + ", hundreds digit = " + s + ", tens digit = " + d + ", ones digit = " + j);
		input.close();
	}

}
