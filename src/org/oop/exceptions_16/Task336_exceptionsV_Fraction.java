package org.oop.exceptions_16;

import java.util.Scanner;

//@author Milica Jaric
/*
Write a program that allows the user to enter a numerator and denominator and that invokes the quotient method.
Handle ArithmeticException.
 */
public class Task336_exceptionsV_Fraction {
    /* Write a method for calculating the quotient of a fraction */
    public static int quotient(int im, int num) {
        int number = 0;
        return number / im;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numerator of the fraction: ");
        int counter = sc.nextInt();
        System.out.println("Enter the denominator of the fraction: ");
        int denominator = sc.nextInt();

        try {
            int numerator = 0;
            int result = quotient(denominator, numerator);
            System.out.println("The quotient is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero: " + e);
        }
        sc.close();

    }
}
