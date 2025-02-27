package com.github.sogandjavaheri.shape;

public class Circle extends Shape {
    private double radius;
    static double pi = 3.14;

    public Circle(){
        this(0.0);
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override
    public void area(){
        double area = pi * radius * radius;
        System.out.println("Area of circle: " + area);
    }
    @Override
    public void perimeter(){
        double perimeter = 2 * pi * radius;
        System.out.println("Perimeter of circle: " + perimeter);
    }
}
