package org.oop.exceptions_16;

//@author Milica Jaric
/*
Write a program that handles exceptions:
1. java.lang.ArithmeticException: / by zero.
2. java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 1.
and prints which of the listed exceptions it 'caught'.
 */
public class Task335_exceptions4 {

    public static void main(String[] args) {

        try {
            int a = 0;
            System.out.println("a = " + a);

            int b = 10 / a;
            int c[] = {1};
            c[10] = 100;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception. " + e.getMessage()); /* show which is the Exception */
        }

        System.out.println("Program continues execution...");

    }

}


