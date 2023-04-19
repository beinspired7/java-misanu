package BranchingStructureSwitchCase_05;

import java.util.Scanner;

//@author Milica Jaric

public class Task97_SwitchCase5 {
	/*
	 * Write a program that reads a character for an operation (+,-,*,/) and two
	 * real operands, and then prints the result
	 */
	public static void main(String[] args) {
		double x, y;
		char operator;

		/* 1. part: Data entry */
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the desired operator: ");
		operator = input.next().charAt(0);
		System.out.println("Enter operand x: ");
		x = input.nextDouble();
		System.out.println("Enter operand y: ");
		y = input.nextDouble();

		/* 2. part: Data processing with SWITCH */
		System.out.println("Solution with SWITCH:");
		switch (operator) {
		case '+':
			System.out.println("X + Y = " + (x + y));
			break;
		case '-':
			System.out.println("X - Y = " + (x - y));
			break;
		case '*':
			System.out.println("X * Y = " + (x * y));
			break;
		case '/':
			System.out.println("X / Y = " + (x / y));
		}

		/* 2. part: Data processing with IF/ELSE */
		System.out.println("\nSolution with IF/ELSE: ");
		if (operator == '+') {
			System.out.println("X + Y = " + (x + y));
		} else if (operator == '-') {
			System.out.println("X - Y = " + (x - y));
		} else if (operator == '*') {
			System.out.println("X * Y = " + (x * y));
		} else if (operator == '/') {
			System.out.println("X / Y = " + (x / y));
		} else {
			System.out.println("Invalid input.");
		}

		input.close();
	}

}
