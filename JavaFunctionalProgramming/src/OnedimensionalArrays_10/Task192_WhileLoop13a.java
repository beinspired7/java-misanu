package OnedimensionalArrays_10;

import java.util.Scanner;

//@author Milica Jaric

public class Task192_WhileLoop13a {
/*
 * Write a program that calculates the value of the function f=[𝑥_𝑖, 𝑦_𝑖 ], 𝑖=1, …,𝑛 for the given arrays x and y of n elements, according to the formula shown in the image. Print out the value of the function.

Code:

java
Copy code
    package JDN;

    import java.util.Scanner;
    
    public class JDN13a {
        public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
    
        System.out.println(" ");
 */
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array n: ");
        int n = ulaz.nextInt();
    
        double x[] = new double[n];
        double y[] = new double[n];
        System.out.println("Enter the number of elements in the array x:");
        for (int i = 0; i < x.length; i++) {
            System.out.print("x[" + i + "] = ");
            x[i] = ulaz.nextDouble();
        }
    
        System.out.println("Enter the number of elements in the array  y:");
        for (int i = 0; i < y.length; i++) {
            System.out.print("y[" + i + "] = ");
            y[i] = ulaz.nextDouble();
        }
    
        double f;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > y[i])
            f = Math.sqrt((x[i] - 0.2) / (2 + y[i]));
            else
            f = Math.sqrt((y[i] - 0.2) / (2 + x[i]));
    
            System.out.println("Za " + x[i] + " i " + y[i] + " is f = " + f);
        }
	}

}
