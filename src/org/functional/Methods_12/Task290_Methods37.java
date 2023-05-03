package org.functional.Methods_12;
//@author Milica Jaric

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Write a program that determines and prints all perfect numbers of the entered number m.

Note: A number is perfect if it is equal to the sum of all divisors excluding itself.
 */


public class Task290_Methods37 {
    public static void perfectNumber(double m) {
        System.out.println("Perfect numbers of number " + m + " are: ");

        // Finding perfect numbers of number m
        for (int n = 2; n <= m; n++) {
            double sum = 1;
            int nk = n / 2;

            for (int i = 2; i <= nk; i++)
                if (n % i == 0)
                    sum += n / i;

            if (sum == n)
                System.out.println(n);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        // m - number for which all perfect numbers are found
        int m;

        System.out.println("Enter a number for which all perfect numbers are to be found m: ");
        m = Integer.parseInt(input.readLine());

        perfectNumber(m);
    }
}