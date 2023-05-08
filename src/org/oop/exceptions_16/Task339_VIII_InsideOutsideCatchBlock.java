package org.oop.exceptions_16;

//@author Milica Jaric
/*

Write a task in which integer a is initialized to the value 1 or 2, and integer b to 10 and process the following exceptions:
1. java.lang.ArrayIndexOutOfBoundsException.
2. java.lang.ArithmeticException.

For the following conditions:
if a = 1 then calculate a = a / (a-a);
if a = 2 then create array integer c = {1};
- set the value of the tenth element of the array c to 100.



 */
public class Task339_VIII_InsideOutsideCatchBlock {


    public static void main(String[] args) {

        try {
            int a = 1;
            int b = 10 / a; /* here is a risky operation */
            System.out.println("a = " + a);

            try {
                if (a == 1)
                    a = a / (a - a);
                if (a == 2) {
                    int c[] = {1};
                    c[10] = 100;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                // inner catch block
                System.out.println("Error with index! " + e);
            }

        } catch (ArithmeticException e) {
            // outer catch block
            System.out.println("Error while sharing! " + e);
        }

    }

}

