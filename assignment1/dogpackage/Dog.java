package assignment1.dogpackage;

import assignment1.animalpackage.Animal;

public class Dog extends Animal {
    public static void main(String[] args) {

        Animal animal=new Animal();
        // Access the private variable using the getter and setter
        animal.setName("Jenny");
        System.out.println(animal.getName());

        // create a object of Dog class
        Dog dog =new Dog();
        // Accessing the protected method
        dog.display();

        // Accessing the public variable
        animal.legCount=4;

        // Accessing the public method
        animal.displayLegCount();

    }
}

