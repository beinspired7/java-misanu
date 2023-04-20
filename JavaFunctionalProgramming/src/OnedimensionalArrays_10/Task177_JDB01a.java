package OnedimensionalArrays_10;
//@author Milica Jaric

import java.util.Scanner;

public class Task177_JDB01a {
/*
 * Write a program that reads and prints the members of an array X with N elements.F
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of array members N: ");
        int n = input.nextInt();
    // Allocating space for an array of n members
        int x[] = new int[n];
        System.out.println("Enter the array members:");
        for (int i = 0; i < x.length; i++) {
            System.out.print("x[" + i + "] = ");
            x[i] = input.nextInt();
        }
    // Printing the array members 
        for (int i = 0; i < x.length; i++)
            System.out.println(x[i]);
	}

}
