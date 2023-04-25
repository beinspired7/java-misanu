package LoopStructuresDoWhileWhileLoop_08;
//@author Milica Jaric

public class Task140_WhileLoop01 {
/*
 * Write a program that prints the first ten natural numbers using both for and while loops.
 */
	public static void main(String[] args) {
		  // Write a program that prints the first 10 natural numbers using for and while loops.
        
        // Solution with for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        
        System.out.println("_______");
        // Solution with while loop
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
	}

}
