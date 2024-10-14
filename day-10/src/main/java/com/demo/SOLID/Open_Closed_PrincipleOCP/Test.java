package com.demo.SOLID.Open_Closed_PrincipleOCP;

public class Test {
	public static void main(String[] args) {
		// Create a rectangle with width 5 and height 10
		Shape rectangle = new Rectangle(5, 10);
		System.out.println("Rectangle Area: " + rectangle.calculateArea());

		// Create a circle with radius 7
		Shape circle = new Circle(7);
		System.out.println("Circle Area: " + circle.calculateArea());
	}
}
