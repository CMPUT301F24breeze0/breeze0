
package com.example.breeze0;

public abstract class Shape {
    private Integer x;
    private Integer y;
    String color = "red"; 
    public Shape(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }


    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
    
    public abstract void draw();
}
