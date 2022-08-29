package OOPS_Concept;

// Object- An entity that has state and behavior is known as object.
// Class- A class is a group of objects which have a common property.

public class ObjectClass {
    int x=100;
    String str="Divya Rai";
    public static void main(String[] args) {
        System.out.println("Objet and class in java");
        ObjectClass oc=new ObjectClass();     //Creating an object of ObjectClass
        System.out.println(oc.x);             // Accessing member through reference variable
        System.out.println(oc.str);
    }
}
