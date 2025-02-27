package com.github.sogandjavaheri.shape;

public class Shape {

    private String color;
    private int dimension;


    public Shape() {
        this("black", 1);
    }

    public Shape(String color, int dimension) {
        this.color = color;
        this.dimension = dimension;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public void area() {
        System.out.println("Specify the shape to calculate the area. ");
    }

    public void perimeter() {
        System.out.println("Specify the shape to calculate the perimeter. ");
    }
}
