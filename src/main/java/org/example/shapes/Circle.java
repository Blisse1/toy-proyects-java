package org.example.shapes;

// when we initialize the circle using
// a constructor, when we instanciate the class
// we need to pass the parameters defined in the constructor

class Circle extends Shape{
    private final int radius;

    // constructor to initialize radius
    public Circle(int radius){
       this.radius = radius;
    }

//    @Override
//    public double calculatePerimeter(){
//        return 2*Math.PI*radius;
//    }

    public double calculateArea(){
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter(){
        return Math.PI * 2 * radius;
    }
}
