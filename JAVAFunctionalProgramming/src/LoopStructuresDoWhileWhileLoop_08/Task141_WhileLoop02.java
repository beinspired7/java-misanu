package LoopStructuresDoWhileWhileLoop_08;
//@author Milica Jaric

public class Task141_WhileLoop02 {
	/*
	 * How many times will the following while loops be executed? int i = 0; while
	 * (++i < 5){ // increase and then compare System.out.println(i); // print the
	 * increased value of i }
	 * 
	 * int i = 0; while (i++ < 5){ // compare and then increase
	 * System.out.println(i); // print the increased value of i }
	 */
	public static void main(String[] args) {
		// How many times will the while statement be executed in the given cases

		int i = 0;

		while (++i < 5) {
			System.out.println(i);
		} // It will be executed 4 times

		i = 0;
		while (i++ < 5) {
			System.out.println(i);
		} // It will be executed 5 times
	}

}
