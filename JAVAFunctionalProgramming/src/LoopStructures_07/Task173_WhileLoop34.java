package LoopStructures_07;

import java.util.Scanner;

//@author Milica Jaric

public class Task173_WhileLoop34 {
/*
 * Write a program that reads a positive integer and prints the largest digit of that number.        
 */
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
        System.out.println("Enter a value for a:");
        int a = ulaz.nextInt();
        int i = a;
        int cifra, max = 0;
        while (a != 0) {
            cifra = a % 10;
            if (cifra > max)
            max = cifra;
            a /= 10;
        }
        System.out.println("The largest digit of the entered number " + i + " is " + max);
	}

}
