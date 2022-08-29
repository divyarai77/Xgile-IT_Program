package OOPS_Concept;

// Polymorphism is a concept in java by which we can perform single action in different ways

class Shape {
    void draw(){
        System.out.println("Drawing");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Draw a circle");
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("draw a square");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("Draw a Triangle");
    }
}
class ShapeTest{
    public static void main(String[] args) {
        Shape s;
        s=new Circle();
        s.draw();
        s=new Square();
        s.draw();
        s=new Triangle();
        s.draw();
    }
}
