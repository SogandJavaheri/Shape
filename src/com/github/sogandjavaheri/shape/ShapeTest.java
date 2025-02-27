package com.github.sogandjavaheri.shape;

public class ShapeTest {

    public static void main(String[] args) {

        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        shape.area();
        shape.perimeter();
        System.out.println("*****************");

        circle.area();
        circle.perimeter();
        System.out.println("*****************");

        rectangle.area();
        rectangle.perimeter();
        System.out.println("*****************");
    }
}
