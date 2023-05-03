package org.functional.Methods_12;
//@author Milica Jaric

public class Task269_Methods16 {

/*
 * 	Create an algorithm and write a program to calculate the value of the determinant
    |1  -3  2|
D = |4  1  -8|
    |-7 8   6|

Calculate the determinant D using the method for calculating the determinant of order two.
 */

public class Metode14 {
// Defining a function for calculating the determinant of order two
static int det(int a1, int a2, int b1, int b2) {
return a1 * b2 - a2 * b1;
}

public static void main(String[] args) {
int[][] a = { { 1, -3, 2 }, { 4, 1, -8 }, { -7, 8, 6 } };
// Calculating the value of the determinant of order three
int determinant = a[0][0] * det(a[1][1], a[1][2], a[2][1], a[2][2])
    - a[0][1] * det(a[1][0], a[1][2], a[2][0], a[2][2]) + a[0][2] * det(a[1][0], a[1][1], a[2][0], a[2][1]);
// Printing the result
System.out.println("The value of the determinant is " + determinant);
}
}
}
