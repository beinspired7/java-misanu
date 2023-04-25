package Class_OOP;
//@author Milica Jaric

import java.util.Scanner;

/*
Define a class called Cat that includes:

a field called name of type String
a method called showName that prints the name of the cat.
Define a driver class called Main that includes:

creates an object of the Cat class called cat with the name entered by the user.
calls the showName method of the cat object.
Questions:
Name three reference data types?
Is the String data type actually a class?
 */

public class Task306_OOP13 {
	public static void main(String[] args) {

		Cat macka = new Cat();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Unesite ime macke: ");

		macka.ime = scanner.nextLine();

		macka.prikazatiIme();

		scanner.close();
	}
}
/*
 * Answers: Three reference data types are: String, Array and Class. Yes, the
 * String data type is actually a class.
 */
