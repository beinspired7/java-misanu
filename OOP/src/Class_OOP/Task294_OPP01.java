package Class_OOP;
//@author Milica Jaric

public class Task294_OPP01 {
	/*
	 * Create a class A with a method named PrikaziPoruku that prints the text
	 * "Ovo je poruka!" (which means "This is a message!" in Serbian). Create a
	 * driver class named ObjekatKlaseA. In the ObjekatKlaseA class, create an
	 * object of class A and call the method PrikaziPoruku.
	 */
	public static void main(String[] args) {
		/*
		 * Creating a new object (instance) of class A. Each object represents an
		 * instance of a particular class. It is created during runtime. An object
		 * consists of a certain number of fields (data).
		 */
		A objekat = new A();

		/*
		 * Class methods are called using the '.' operator.
		 */
		objekat.PrikaziPoruku();

	}
}
