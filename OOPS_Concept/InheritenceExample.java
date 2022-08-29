package OOPS_Concept;

// Inheritance is a mechanism in which one object acquire all the properties and behaviors of the parent class objects

// Single Inheritance example---------
/*class Animal {
    void eat() {
        System.out.println("Eating--");
    }
}
    class Lion extends Animal{
        void sound(){
            System.out.println("Roar--");
        }
    }
    class AnimalTest{
    public static void main(String[] args) {
        Lion l =new Lion();
        l.eat();
        l.sound();
    }
}

 */

// Multilevel Inheritance

/*class Animal {
    public void eating() {
        System.out.println("Eating Food");
    }
}
class Cat extends Animal{
    public void sounds(){
        System.out.println("meow meow");
    }
}
class BabyCat extends Cat{
    public void scratch(){
        System.out.println("Scratching the wall");
    }
}
class AnimalTest{
    public static void main(String[] args) {
        BabyCat bc=new BabyCat();
        bc.eating();
        bc.scratch();
        bc.sounds();
    }
}

 */

// Hierarchical Inheritance

class Animal{
    void sound(){
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal{
    void eating(){
        System.out.println("Eating Food");
    }
}
class BabyDog extends Animal{
    void color(){
        System.out.println("Color is black");
    }
}
class AnimalTest{
    public static void main(String[] args) {
        BabyDog bd=new BabyDog();
        bd.sound();
        bd.color();

    }
}