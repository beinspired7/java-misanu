package LinearStructures_01;
//@author Milica Jaric

import java.util.Scanner;

/*
 * Write a program that calculates the body mass index BMI = m[kg]/(h[m])2 for a given height and weight.
 * 
 */
public class BMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the person's height: ");
		double height = input.nextDouble();
		System.out.print("Enter the person's weight: ");
		double weight = input.nextDouble();
		System.out.println("Body mass index BMI = " + weight / Math.pow(height, 2));
		input.close();
	}
}
