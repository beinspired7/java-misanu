package OnedimensionalArrays_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Milica Jaric

public class Task220_WhileLoop40 {
/*
 * Write an algorithm and a program to calculate the personal income of workers.
First, the value of one point is entered, followed by data for each worker: name, number of points,
loan rate and the total value of all memberships deducted from the worker.
Print how much each worker should be paid and the total amount to be paid.

 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		double sum = 0, pointValue;
        String[] name = new String[20];
        double[] pointNumber = new double[20];
        double[] loanRate = new double[20];
        double[] membership = new double[20];
        double[] personalIncome = new double[20];
        int numberOfWorkers;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        // Input data
        System.out.println("Enter the value of one point: ");
        pointValue = Double.parseDouble(input.readLine());
        System.out.println("Enter the number of workers: ");
        numberOfWorkers = Integer.parseInt(input.readLine());
        System.out.println("Enter data for each worker: name, number of points, loan rate and membership: ");
        for (int i = 1; i <= numberOfWorkers; i++) {
            System.out.println("Data for worker " + i);
            System.out.print("Name: ");
            name[i] = input.readLine();
            System.out.print("Number of points: ");
            pointNumber[i] = Double.parseDouble(input.readLine());

            System.out.print("Loan rate: ");
            loanRate[i] = Double.parseDouble(input.readLine());
            System.out.print("Membership: ");
            membership[i] = Double.parseDouble(input.readLine());

            // Calculation of personal income of workers and total amount to be paid
            personalIncome[i] = pointNumber[i] * pointValue - loanRate[i] - membership[i];
            sum += personalIncome[i];
        }

        // Print header
        System.out.println("Name\tPoint Number\tLoan Rate\tMembership\tIncome ");

        // Print results
        for (int i = 1; i <= numberOfWorkers; i++)
            System.out.println(name[i] + "\t" + pointNumber[i] + "\t\t" + loanRate[i] + "\t" + membership[i] + "\t\t"
                    + personalIncome[i]);

        System.out.println("===================================================");
        System.out.println("Total amount to be paid: \t\t\t" + sum);
	}

}
