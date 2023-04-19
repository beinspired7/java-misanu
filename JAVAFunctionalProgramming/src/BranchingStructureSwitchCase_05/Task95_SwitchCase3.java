package BranchingStructureSwitchCase_05;

import java.util.Scanner;

//@author Milica Jaric

public class Task95_SwitchCase3 {
/*
 * Write a program that prints possible x and y coordinates depending on the quadrant number entered.
 */
	public static void main(String[] args) {
		 int angle;

		    /* 1. part: Input */

			Scanner ulaz = new Scanner(System.in);

		    System.out.println("Enter an angle: ");
		    angle = ulaz.nextInt();

		    /* 2. part: Data processing */
		    if (angle > 0 && angle < 90) {
		        System.out.println("First quadrant.");
		    } else if (angle > 90 && angle < 180) {
		        System.out.println("Second quadrant.");
		    } else if (angle > 180 && angle < 270) {
		        System.out.println("Third quadrant.");
		    } else if (angle > 270 && angle < 360) {
		        System.out.println("Fourth quadrant.");
		    } else {
		        System.out.println("The entered angle is on the x or y axis.");
		    }
		    ulaz.close();
	}

}
