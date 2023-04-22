package Methods_12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//@author Milica Jaric

public class Task291_Methods38 {
    // Method for calculating the distance between two points
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        // Declaration of data
        double a, b, c, xa, ya, xb, yb, xc, yc, p, s;

        // Input of coordinates for vertex A of the triangle
        System.out.println("Enter the coordinates of vertex A of the triangle: ");
        System.out.print("xa = ");
        xa = Double.parseDouble(input.readLine());
        System.out.print("ya = ");
        ya = Double.parseDouble(input.readLine());

        // Input of coordinates for vertex B of the triangle
        System.out.println("Enter the coordinates of vertex B of the triangle: ");
        System.out.print("xb = ");
        xb = Double.parseDouble(input.readLine());
        System.out.print("yb = ");
        yb = Double.parseDouble(input.readLine());

        // Input of coordinates for vertex C of the triangle
        System.out.println("Enter the coordinates of vertex C of the triangle: ");
        System.out.print("xc = ");
        xc = Double.parseDouble(input.readLine());
        System.out.print("yc = ");
        yc = Double.parseDouble(input.readLine());

        // Calculating the sides of the triangle
        a = distance(xb, yb, xc, yc);
        b = distance(xa, ya, xc, yc);
        c = distance(xa, ya, xb, yb);

        // Calculating the semiperimeter of the triangle
        s = (a + b + c) / 2;

        // Calculating the area of the triangle
        p = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Printing the result
        System.out.println("The area of the triangle is " + p);
    }
}