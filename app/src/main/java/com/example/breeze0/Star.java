package com.example.breeze0;

public class Star extends Shape {
    private Integer points;

    public Star(Integer x, Integer y, String color, Integer points) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.points = points;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public void displayStarInfo() {
        System.out.println("Star located at (" + x + ", " + y + ") with " + points + " points and color " + color);
    }
}
