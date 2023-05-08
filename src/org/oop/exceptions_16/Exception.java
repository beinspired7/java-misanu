package org.oop.exceptions_16;

public class Exception extends Exception.Exception {
     /* The index of the student that causes the exception */
        private int indexStudent; /* Default constructor */

        public Exception() {
            student index = -1;
        }

        public Exception(int indexStudent) {
            super("An exception occurred: the student's index number is greater than 100");
            this.indexStudent = indexStudent;
        } /* Get the index of the student for which the error occurred */

        public int getStudentIndex() {
            return student index;
        }
    }
