package Class_OOP;
//@author Milica Jaric

/*
 * Define class A that contains:
 * 
 * method prikaziPoruku that prints the text "Primer static metode!". Define a
 * driver class metodaStaticPrikaz and in it:
 * 
 * Run the method prikaziPoruku from class A without creating an object of the
 * class. Questions: What does the keyword 'void' mean? Would Eclipse throw an
 * error if we omitted the keyword static when creating the prikaziPoruku
 * method? What conclusion can we draw about the existence of the static
 * keyword?
 */

public class A1 {
	public String message;

	/*
	 * By declaring private data, encapsulation - data hiding, is performed.
	 * Preventing the changing of variable values from code outside of the class.
	 * 
	 * Data = attribute = class property. Objects have their own attributes.
	 * Attributes are represented through variables in class declarations. They are
	 * declared within a class outside of all methods.
	 * 
	 * Class method
	 * 
	 * The setMessage method sets the message.
	 */

	public void setMessage(String msg) {
		message = msg; /* sets the value of the 'message' variable */
	}

	/* The getMessage method returns the message. */
	public String getMessage() { /* no parameters, returns the appropriate data type */
		return message;
	}

	/*
	 * Method parameters and arguments A variable declared in the method header is
	 * called a parameter. An argument is passed to the method when calling the
	 * method. !!! When calling the method, parameters are assigned the value of the
	 * method's arguments.
	 * 
	 */

}
