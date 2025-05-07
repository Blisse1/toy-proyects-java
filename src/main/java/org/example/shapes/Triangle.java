package org.example.shapes;

class Triangle implements Shape {
    private int base, height, a, b, c;

    // initialize it using a constructor
    public Triangle(int base, int height, int a, int b, int c){
        this.base = base;
        this.height = height;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // le estoy pasando parametros que el metodo de la clase
    // abstracta no tiene. Ojo con ese error

    public double calculateArea(){
        return (double)(base * height) / 2;
    }

    public double calculatePerimeter(){
        return a + b + c;
    }
}
