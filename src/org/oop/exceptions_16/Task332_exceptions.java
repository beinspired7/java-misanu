package org.oop.exceptions_16;

//@author Milica Jaric

/*
Write a program that throws the exception 'java.lang.ArithmeticException: / by zero'.
 */
public class Task332_exceptions {
    public static void main(String[] args) {
        int d = 0;
        int a = 10 / d;
    }
}
/* An exception is a sign that a problem occurred during the execution of the program.
 * Exception handling is the catching and handling of exceptions.
 * Some exceptions can be handled so that the program continues to run without interruption,
 * while others require the termination of the program.
 *
 * */