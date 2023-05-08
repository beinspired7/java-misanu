package org.oop.exceptions_16;
//@author Milica Jaric

/*
Write a program that handles the exception 'java.lang.ArithmeticException: / by zero' to enable
further execution of the program.
 */
public class Task333_exceptions2 {

    public class Main {

        public  void main(String[] args) {
            int d, a;

            try {/* Commands that can throw an exception are placed in the try block
             as well as those commands that will not be executed if an exception occurs.
             */
                d = 0;
                a = 10 / d;
                System.out.println("This message will not be printed! ");
            } catch (ArithmeticException e) {
                System.out.println("Division by zero happened. ");
            }
            System.out.println("Program continues execution! ");

        }

    }
}
/*Exception hierarchy
 *
 * All exceptions are derived from the Throwable class.
 * The Throwable class has two direct descendants: Error and Exception.
 *
 * The Error class describes fatal errors. (errors that we cannot influence).
 * For errors of this type, it is not necessary to specify try / catch blocks.
 *
 * The Exception class is the class from which the classes that belong are derived
 * unchecked exception types.
 *
 * Exception {RuntimeException, IOException}
 *
 * RuntimeException{IndexOutOfBoundsException, ArithmeticException}
 *
 * */