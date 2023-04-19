package LoopStructuresDoWhileWhileLoop_08;

import java.util.Scanner;

//@author Milica Jaric

public class Task161_WhileLoop22 {
/*
 * Write a program that determines the sum of the first 10 entered even numbers. 
 * The user enters numbers in order until he enters zero or 10 even numbers. 
 * When zero is entered, the summing of numbers should be stopped regardless of whether exactly 10 even numbers have been summed.        
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int b = 1, sum = 0, i = 0;
    
        // First way
        while (i < 10 && b != 0) {
            System.out.println("Enter a number:");
            int num = input.nextInt();
            if (num == 0)
            b = 0;
            else if (num % 2 == 0) {
            sum += num;
            i++;
            }
        }
    
        // Second way to print from lecture
    
        if (b == 1)
            System.out.println("Sum of 10 even numbers is obtained");
        else
            System.out.println("User entered the number 0");
        System.out.println("i = " + i + " sum = " + sum);
	}

}
