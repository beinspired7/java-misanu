package Class_OOP;
//@author Milica Jaric

/*
 * Define the Circle class containing:

a private double radius data field.
a constructor that initializes the radius data field to the starting value of 0.0.
a parameterized constructor that sets a new value for the radius data field using the this keyword.
a method named area for calculating the area of the circle (PI * r2).
Define the driver class PassingObjectToMethodDisplay, which should:

create a Circle object named c1 with a parameter value of 20.
a static method calcArea to which an object is passed as an argument.
the calcArea method should print the area of the circle of the object by calling the area method of object c1.
Questions:
Why is an object passed to a method?
Can you modify the state of an object passed as an argument to a method?
What are the benefits of passing an object to a method?
 */
public class Task301_OOP8 {
	/*
	 * Passing an object to a method / / Unlike when passing a primitive data type
	 * to a method, passing an object to a method allows us to manipulate a complex
	 * data type that consists of multiple primitive data types.
	 */

	public static void main(String[] args) {

		Circle c1 = new Circle(20);

		calcArea(c1);
	}

	public static void calcArea(Circle c) {
		System.out.println("Area of circle: " + c.area());
	}

	/*
	 * BENEFITS of passing an object to a method
	 * 
	 * Allows you to reuse code. You can write a single method that can work on
	 * different objects, as long as they belong to a class that has the appropriate
	 * methods or fields.
	 */
}
