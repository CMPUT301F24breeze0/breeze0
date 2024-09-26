package com.example.breeze0;

public abstract class Shape {
    private Integer x;
    private Integer y;
    String color = "blue"; // Replace with your chosen color when resolving conflicts.

    // Constructor
    public Shape(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    // Setters
    public void setX(Integer x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    // Abstract method to be implemented by subclasses
    public abstract void draw(); 
}
