package Class_OOP;
//@author Milica Jaric

public class Task300_OOP7 {
	/*
	 * Define the Circle class containing:
	 * 
	 * a private double radius data field. a constructor that initializes the radius
	 * data field to the starting value of 0.0. a parameterized constructor that
	 * sets a new value for the radius data field using the this keyword. a method
	 * named area for calculating the area of the circle (PI * r2). Define the
	 * driver class ObjectAsParameter, which should:
	 * 
	 * create a Circle object named c1 with a parameter value of 10. create a Circle
	 * object named c2 with an object c1 as a parameter. print the value of the area
	 * of the circle by calling the area method of object c2. Question: How is an
	 * object passed to a class constructor?
	 * 
	 */
	/* Passing an object to a constructor */

	public static void main(String[] args) {

		Circle c1 = new Circle(10);
		Circle c2 = new Circle(c1);
		System.out.println("Area of circle: " + c2.area());

	}
}
