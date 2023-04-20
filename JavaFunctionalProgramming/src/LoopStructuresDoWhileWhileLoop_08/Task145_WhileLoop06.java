package LoopStructuresDoWhileWhileLoop_08;

import java.util.Scanner;

//@author Milica Jaric

public class Task145_WhileLoop06 {
/*
 * Write a program to print the sum of numbers from k to the given number n.


 */
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
        int i, k, n, sum = 0;
        System.out.print("Enter a value for k: ");
        k = ulaz.nextInt();
        System.out.print("Enter a value for n: ");
        n = ulaz.nextInt();
    
        i = k;
        /*
            * while (i <= n) { sum += i; i++; }
            */
        // More readable solution
        while (i <= n)
            sum += i++;
    
        System.out.println("Sum from " + k + " to " + n + " is " + sum);
	}

}
