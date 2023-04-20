package LoopStructuresDoWhileWhileLoop_08;
//@author Milica Jaric

public class Task142_WhileLoop03 {
	/*
	 * Write a program to print the sum of reciprocal values of the first n natural
	 * numbers (harmonic series: S = 1 + 1/2 + 1/3 + ... + 1/n).
	 */
	public static void main(String[] args) {
		int sum = 0; /* 0 is a neutral value when adding */
		for (int i = 1; i <= 10; i++) {
			sum = sum + i; // sum += i;

		}
		System.out.println("The sum of the numbers is: " + sum);
	}
}
