package org.oop.class1;

//@author Milica Jaric

/*

Define the starting class  and in it:

a static method test in which:
-> initializes a variable a of type integer with a value of 10.
-> prints the text "BBB".
-> then, returns; if the following condition is met: a == 10
-> sequentially after that, the text "CCC" is printed.
In the main function, execute the following commands sequentially:

print the text "AAA".
call the method test.
print the text "DDD".
Questions:
What does the return statement mean in a method?
How is System.exit() different from the return statement in a method?


/*Difference between System.exit() & return statement in a method?

The System.exit method is a static method that terminates the currently running Java Virtual Machine (JVM).

The return statement, on the other hand, is used to exit a method and return a value to the code.
It's typically used to exit method execution and return control to the calling code, but it can also
be used to return a value from the method to the code.

It's important to note that the System.exit method terminates the entire JVM,
whereas the return statement "exits" only the current block of the method.

The System.exit method should be used with caution, as it can have unintended consequences
and should only be used in exceptional circumstances.

The return statement, on the other hand, is a commonly used control flow construct used to
exit a method and return a value to the code.
*/

public class Task303_OOP10 {

	public class ReturnTest {

		public static void test() {
			int a = 10;
			System.out.println("BBB");
			if (a == 10) {
				return;
			}
			System.out.println("CCC");

		}

		public static void main(String[] args) {
			System.out.println("AAA");
			test();
			System.out.println("DDD");
		}
	}
}
