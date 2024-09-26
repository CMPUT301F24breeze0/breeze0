// Circle.java
package com.example.breeze0;

// Circle class extends Shape
public class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(Integer x, Integer y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Implement the abstract method draw
    @Override
    public void draw() {
        System.out.println("Drawing a circle at (" + getX() + ", " + getY() + ") with radius " + radius);
    }
}
