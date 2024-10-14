package com.demo.SOLID.Liskov_Substitution_Principle_LSP;

public class Test {
    public static void main(String[] args) {
        Shape rectangle = new Ractangle(5, 8);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

        Shape square = new Square(5);
        System.out.println("Area of Square: " + square.calculateArea());
    }
}
