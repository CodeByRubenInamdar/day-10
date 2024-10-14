package com.demo.SOLID.Liskov_Substitution_Principle_LSP;

public class Ractangle implements Shape {
    private double width;
    private double height;

    // Constructor to initialize width and height
    public Ractangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
