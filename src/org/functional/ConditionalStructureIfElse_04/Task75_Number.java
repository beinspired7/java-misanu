package org.functional.ConditionalStructureIfElse_04;

import java.util.Scanner;

//@author Milica Jaric

public class Task75_Number {
/*
 * Write a program that, for a given three-digit number, outputs the largest possible number composed of those three digits.
 */
	public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int number, j, d, s, result;
            System.out.print("Enter a three-digit number:");
            number = input.nextInt();
            j = number % 10;
            d = (number / 10);
            d = d % 10;
            s = number / 100;
            if (j > d) {
                int t = j;
                j = d;
                d = t;
            }
            if (j > s) {
                int t = j;
                j = s;
                s = t;
            }
            if (d > s) {
                int t = d;
                d = s;
                s = t;
            }
            result = s * 100 + d * 10 + j;
            System.out.print("Result: " + result);
            input.close();
	}

}
