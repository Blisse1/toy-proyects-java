package org.example.shapes;

public class Main {
    public static void main(String[] args) {

        Circle myCircle = new Circle(4);
        System.out.println(myCircle.calculateArea());
//        System.out.println(myCircle.calculatePerimeter());
        Triangle myTriangle = new Triangle(4, 3, 3, 4, 5);
        System.out.println(myTriangle.calculateArea());
        System.out.println(myTriangle.calculatePerimeter());
    }
}
