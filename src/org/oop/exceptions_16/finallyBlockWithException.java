package org.oop.exceptions_16;
//@author Milica Jaric

public class finallyBlockWithException {

    // Throught an exception out of the method

    static void procA() {
        try {
            System.out.println("inside procA");
            throw new RuntimeException("demo"); // throws is at the head of the method
            // throw are used to throw exceptions in the method body
        } finally { /* finally block is executed regardless of whether or not an exception occurred*/
            System.out.println("procA");
        }
    }

    static void procB() {
        try {
            System.out.println("procB");
            return;
            /* break, continue, System.exit(0) */
        } finally {
            System.out.println("procB's finally");
        }
    }

    // Execute a try block normally.
    static void procC() {
        try {
            System.out.println("inside procC");
        } finally {
            System.out.println("procC's finally");
        }
    }
}
