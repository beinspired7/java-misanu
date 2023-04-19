package ConditionalStructure_04;
//@author Milica Jaric

import java.util.Scanner;

public class Task73_ReciprocalValue {
/*
 * Write a program that, for three input numbers a, b, and c, prints the reciprocal value of the smallest number, and if min = 0, prints 3.
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        int a = input.nextInt();
        System.out.print("Enter value for b: ");
        int b = input.nextInt();
        System.out.print("Enter value for c: ");
        int c = input.nextInt();
        double r = 0;
        double min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        System.out.println("The smallest number is " + min);
        if (min == 0)
            r = 3;
        else
            r = 1 / min;
        System.out.println("r = " + r);
        input.close();
	}

}
