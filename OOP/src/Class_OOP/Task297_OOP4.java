package Class_OOP;
//@author Milica Jaric

public class Task297_OOP4 {
	/*
	 * Define the Circle class which contains:
	 * 
	 * a private data member named "poluprecnik" of type double. a default
	 * constructor that sets the value of the "poluprecnik" variable to 10.0. a
	 * method named "area" for calculating the area of the circle (pi * r^2). Define
	 * a driver class named "DefaultConstructorPrikaz" and inside it:
	 * 
	 * Create an object of the Circle class named "c1". Set the value "Vrednost1"
	 * using the "area" method. Calculate the area of the circle using the "area"
	 * method. Finally, print out the value of the area of the circle. Questions:
	 * What does the "new" keyword mean? What happens if a constructor is not
	 * defined? What is a class constructor? Can a constructor have a different name
	 * than its class? What does it mean when it is said that a constructor 'does
	 * not return a value'? Can a constructor be declared as void? In terms of class
	 * data, what would be the default value for the String type?
	 * 
	 * 
	 */
	public class Circle {
		private double poluprecnik;

		Circle() {
			poluprecnik = 10.0;
		}
		/*
		 * "poluprecnik" has a value of 10, which is set in the constructor when the
		 * object is created
		 */

		/* If a constructor is not defined, the compiler sets default values */

		public double area() {
			return 3.14 * poluprecnik * poluprecnik;
		}
	}

}
