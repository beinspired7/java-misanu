package org.oop.exceptions_16;
//@author Milica Jaric

import org.oop.class1.InvalidAgeException;

public class Task341ExceptionsXII_UserDefineException {

    public static void checkAge(int age) throws InvalidAgeException {

        System.out.println("Checking age Vlidity: (" + age + ")");
        if (age < 0 || age > 100) {
            throw new InvalidAgeException(age);
        }
        System.out.println("Age: " + age + " is a valid age.");
    }

    public static void main(String[] args) {

        try {
            checkAge(25);
            checkAge(-5);

        } catch (InvalidAgeException e) {
            throw new ArithmeticException("Ovo je vezani exception");

        }
    }

    // UserDefineException, ChainedException

    // Throws se koristi u zaglavlju metode da naznaci tipove izuzetaka koje baca metoda
    // Throw se koristi za bacanje izuzetka u telu metode

}
