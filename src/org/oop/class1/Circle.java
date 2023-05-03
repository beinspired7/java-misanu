package org.oop.class1;
//@author Milica Jaric

public class Circle {
	private double radius;

	Circle() {
		radius = 0.0;
	}

	Circle(double radius) {
		this.radius = radius;
	}

	Circle(Circle ob) {
		radius = ob.radius;
	}

	public double area() {
		return 3.14 * radius * radius;
	}

}
