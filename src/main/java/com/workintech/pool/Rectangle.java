package com.workintech.pool;

public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int length , int width) {

        this.length = length < 0 ? 0 : length;
        this.width = width < 0 ? 0 : width;
    }


    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }


    public int getArea(){
        return width*length;
    }




}
