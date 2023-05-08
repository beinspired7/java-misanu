package org.oop.exceptions_16;
//@author Milica Jaric

/*
Write a program that handles the exception ' java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 1 ' to enable
further execution of the program.
 */

public class Task334_exceptions3 {

    public static void main(String[] args) {
        try {
            int c[] = { 1 }; /* One way to initialize a string */
            c[10] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Non-existent index inside array.");
        }
        System.out.println("Continuing program execution...");
    }
}
