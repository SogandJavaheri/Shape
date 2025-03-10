package com.github.sogandjavaheri.shape;

public class Rectangle extends Shape {
    private double width;
    private double height;


    public Rectangle(){
        this(0.0,0.0);
    }

    public Rectangle(double width, double height) {
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
    public void area() {
        double area = width * height;
        System.out.println("Area of Rectangle is " + area);
    }

//    @Override
//    public void perimeter() {
//        double perimeter = width * height;
//        System.out.println("Perimeter of Rectangle is " + perimeter);
//    }
}
