package org.oop.exceptions_16;
//@author Milica Jaric

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Define the Student class and in it:
- data of the first and last name type String,
- data numberIndex type int,
- data average grade of type double which represents the average grade during studies,
- the method getNameSurname which returns the current value of the data nameSurname,
- the method setNameSurname, which as an input argument receives a new value for the data nameSurname and assigns that value,
- the method getNumberIndex that returns the current value of the numberIndex data,
- the setIndexNumber method, which receives a new value for the numberIndex data as an input argument and assigns that value,
- the getAverageRate method, which returns the current value of the averageRate data,
- the setAverageRate method, which receives a new value for the averageRate data as an input argument and assigns that value. ,

Define an Exception class that inherits from the Exception class and contains:
- private data indexStudent type int,
- the default constructor for initializing the Student index data,
- a constructor with the Student index parameter that calls the constructor of the Exception class and provides information about the exception that occurred
- the getIndexStudent method that returns the index of the student that causes the exception.

Define the starting class TestException in which data about the student is entered.
If an exception occurs, display the stack trace using the printStackTrace method and using an array whose elements come from the stack trace.
 */
public class Task343X_Exceptions_Student {

    public class TestStudent {
        public  void main(String[] args) throws Exception { /* Declaring data */
            String nameSurname;
            int numberIndex;
            double averageRate;
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            try { /* Enter student data */
                System.out.print("Enter the first and last name of the student: ");
                nameLastName = input.readLine();
                System.out.print("Enter student index number: ");
                numberIndex = Integer.parseInt(input.readLine());
                System.out.print("Enter the student's average grade: ");
                averageRate = Double.parseDouble(input.readLine()); /* Create object of class Student */
                student s = new student(); /* Set student data */
                s.setNameLastName(nameLastName);
                s.setIndexNumber(IndexNumber);
                s.setAverageScore(averageScore); /* Print student information */
                System.out.println("\nStudent details are: ");
                System.out.println("First and last name: " + s.getNameLastName() + "\nIndex number: " + s.getIndexNumber()
                        + "\nAverage score: " + s.getAverageScore());
            } catch (Throwable e) { /* Print information about the exception using the printStackTrace method */
                System.out.println("Printing exception information using printStackTrace method");
                e.printStackTrace(); /* Create stack trace */
                StackTraceElement stack[] = e.getStackTrace(); /* Input elements */
                for (int i = 0; i < stack.length; i++) {
                    String fileName = stack[i].getFileName();
                    String className = stack[i].getClassName();
                    String methodName = stack[i].getMethodName();
                    boolean isNativeMethod = stack[i].isNativeMethod();
                    int line = stack[i].getLineNumber();
                } /* Print exception information from stack trace */
                System.out.println("\nPrinting exception information from stack trace");
                for (int i = 0; i < stack.length; i++)
                    System.out.println(stack[i]);
            }
        }
    }