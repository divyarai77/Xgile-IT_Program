package OOPS_Concept;

// Abstraction is a process of hiding the implementation details and showing only functionality to the user

abstract class Shape1 {
    abstract void draw();
}
class Rectangle extends Shape1{
    void draw(){
        System.out.println("Rectangle shape");
    }
}
class Oval extends Shape1{
    void draw(){
        System.out.println("Oval Shape");
    }
}
class ShapeTest1{
    public static void main(String[] args) {
        Shape1 s=new Oval();
        s.draw();
    }
}
