package Class_OOP;
//@author Milica Jaric

/* The System.exit() method in Java is a static method that terminates the currently running
Java Virtual Machine (JVM). It requires an integer argument that specifies the exit status of the JVM.
A status of 0 indicates that the JVM was terminated normally, while a status different from zero indicates
that the JVM was terminated with an error.

Drawbacks of using System.exit(0)
- Immediately terminates the JVM, not giving other threads or resources a chance to "clean up" or shut down.
- Can make the code harder to understand and maintain.
- Can make testing the code more difficult.
- Can make debugging the code more difficult.
*/

public class Task302_OOP9 {

	public static void test() {
		int a = 10;
		System.out.println("BBB");

		if (a == 10) {
			System.exit(0);
		}
		System.out.println("CCC");
	}

	public static void main(String[] args) {
		System.out.println("AAA");
		test();
		System.out.println("DDD");
	}
}
