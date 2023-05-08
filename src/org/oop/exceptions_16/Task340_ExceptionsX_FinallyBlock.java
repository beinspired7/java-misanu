package org.oop.exceptions_16;
//@author Milica Jaric

public class Task340_ExceptionsX_FinallyBlock {

    public static void main(String[] args) {

        finallyBlockWithException fbwe = new finallyBlockWithException();

        try {
            fbwe.procA();
        } catch (Exception e) {
            System.out.println("Exception caught");
        }

        fbwe.procB();
        fbwe.procC();

    }
}
