package LinearStructures_01;
//@author Milica Jaric

public class Task04_CirclePerimeter {

	/*
	 * Write a program to calculate the perimeter of a circle using a declared
	 * constant PI. Do not solve the task using the PI constant declared in the Math
	 * class. em.out.println("The perimeter of the circle is " + perimeter +
	 * " for a radius of " + r);
	 */
	public static void main(String[] args) {

		final float PI = 3.14159f;
		float r = 5, perimeter;
		perimeter = 2 * r * PI;
		System.out.println("The perimeter of the circle is " + perimeter + " for a radius of " + r);
	}

}
