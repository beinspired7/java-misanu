package ConditionalStructure_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Milica Jaric

public class Task77_ConditionalStructure2 {
/*
 * Let a, b, and c be given segments with lengths. Write an algorithm and a program to check whether the given segments can construct a triangle, and if they can, 
 * calculate the area of the triangle according to the formula shown in the image.
 */
	public static void main(String[] args) throws NumberFormatException, IOException {
        double a, b, c;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the length of segment a: ");
        a = Double.parseDouble(input.readLine());
        System.out.print("Enter the length of segment b: ");
        b = Double.parseDouble(input.readLine());
        System.out.print("Enter the length of segment c: ");
        c = Double.parseDouble(input.readLine());
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            double p = 0.25 * Math.sqrt((a + b + c) * (b + c - a) * (a + c - b) * (a + b - c));
            System.out.println("The area of the triangle is " + p);
        } else
            System.out.println("The given segments cannot construct a triangle.");
        }
	}


