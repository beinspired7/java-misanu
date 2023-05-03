package org.functional.ConditionalStructureIfElse_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

//@author Milica Jaric

public class Task76_ConditionalStructure1 {
/*
 * Write an algorithm and a program that, for given real numbers x and y, calculates the value of the function f(x, y) according to the formula shown in the image. 
 * Print the value of the function to the output. 
 */
	public static void main(String[] args) {
		 double x = 0, y = 0, f;
         DecimalFormat df = new DecimalFormat("#.##");
         BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
         System.out.print("Enter a value for x: ");
         try {
			x = Double.parseDouble(input.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         System.out.print("Enter a value for y: ");
         try {
			y = Double.parseDouble(input.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         if (x > y)
             f = Math.sqrt((x - 0.2) / (2 + y));
         else
             f = Math.sqrt((y - 0.2) / (2 + x));
         System.out.println("The value of the function is " + df.format(f));
	}

}
