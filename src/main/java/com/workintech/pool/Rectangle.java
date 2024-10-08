package com.workintech.pool;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = Math.max(0, length);
        this.width = Math.max(0, width);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return width * length;
    }
}
