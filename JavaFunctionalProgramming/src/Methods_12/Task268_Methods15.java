package Methods_12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//@author Milica Jaric

public class Task268_Methods15 {
//	Write a function that checks whether a rectangle with sides a and b can fit entirely inside a rectangle with sides c and d, given that their sides are parallel. Enter the rectangle with sides a and b and n rectangles with sides c and d in the main program.


	public class Methods13 {
	public static boolean condition(int a, int b, int c, int d) {
	return ((a < c) && (b < d)) || ((a < d) && (b < c));
	}


	public static void main(String[] args) throws Exception {
	int a, b, n;
	int c[] = new int[100];
	int d[] = new int[100];
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	// Input data
	System.out.print("Enter the value for a: ");
	a = Integer.parseInt(input.readLine());
	System.out.print("Enter the value for b: ");
	b = Integer.parseInt(input.readLine());
	System.out.print("How many new rectangles do you want to enter? ");
	n = Integer.parseInt(input.readLine());
	System.out.print("Enter the values for c and d: \n");
	for (int i = 1; i <= n; i++) {
	System.out.print("c[" + i + "] = ");
	c[i] = Integer.parseInt(input.readLine());
	System.out.print("d[" + i + "] = ");
	d[i] = Integer.parseInt(input.readLine());
	}
	for (int i = 1; i <= n; i++) {
	if (condition(a, b, c[i], d[i]))
	System.out.println("The rectangle with sides c = " + c[i] + " and d = " + d[i]
	+ " fits inside the rectangle with sides a = " + a + " and b = " + b);
	else
	System.out.println("The rectangle with sides c = " + c[i] + " and d = " + d[i]
	+ " does not fit inside the rectangle with sides a = " + a + " and b = " + b);
	}
	}
	}
}
