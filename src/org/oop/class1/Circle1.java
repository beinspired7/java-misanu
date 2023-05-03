package org.oop.class1;
//@author Milica Jaric

public class Circle1 {
	private double radius;

	Circle1() {
	radius = 0.0;
	}

	Circle1(double radius) {
	this.radius = radius;
	}

	public double area() {
	return 3.14 * radius * radius;
	}
}
