package org.oop.exceptions_16;
//@author Milica Jaric

/*
Write a program that checks for the exception java.lang.ArithmeticException: / by zero and simulate the same catch block of the same type of exception.
 */
public class Task338_Exceptions7 {

    public static void main(String[] args) {

        try {
            int a = 0;
            int b = 10 / a;
        } catch (ArithmeticException e) {
            System.out.println("Exception" + e);
        /* catch (ArithmeticException e) {
             System.out.println("Exception1");
         }
{
}



        /* If there are more catch blocks whose parameter type corresponds to the type
 * thrown exception, only the first such catch block is executed.
 * It is an error to specify two catch blocks with the same parameter type.
 */
        }
    }
}