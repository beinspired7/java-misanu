package Class_OOP;

//@author Milica Jaric

/*
Define a class ABC with:

a method named ABC for printing the text "Object is created".
Define a class XYZ with:

a method named XYZ for printing the text "Object is created".
Define a launcher class named InstanceOfPrikaz with:

create an object of class ABC named a.
create an object of class XYZ named x.
determine whether the object a belongs to the class ABC using the instanceof operator.
determine whether the object x belongs to the class XYZ using the instanceof operator.
print the result
Questions:
What does the instanceof operator mean?
What does Main (Launcher) class mean?



/*
In Java, the main class is the class that contains the main() method,
which is the entry point of the program. The main() method is where
the Java Virtual Machine (JVM) starts executing the program. The main()
method must be declared public so that it can be called by the JVM. It
also needs to be declared static so that it can be called without creating
an instance of the class. The return type void indicates that the method
doesn't return a value. The main() method takes one argument of type String[],
which represents an array of command-line arguments passed to the program.
These arguments are optional and can be used to pass input to the program when
it runs.*/

public class Task305_OOP12 {

	public class InstanceOfPrikaz {

		public static void main(String[] args) {

			ABC a = new ABC();
			XYZ x = new XYZ();

			if (a instanceof ABC) {
				System.out.println("a is an instance of class ABC.");
			} else {
				System.out.println("a is not an instance of class ABC.");
			}

			if (x instanceof XYZ) {
				System.out.println("x is an instance of class XYZ.");
			} else {
				System.out.println("x is not an instance of class XYZ.");
			}
		}
	}

	/*
	 * The instanceof operator in Java is a type comparison operator used to
	 * determine whether an object is an instance of a particular class or
	 * implements a particular interface.
	 */
}
