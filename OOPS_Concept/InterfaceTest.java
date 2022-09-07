/**
    Interface- An Interface in java is defined as an abstract type used to specify the behavior of class.
    An Interface in jva is a blueprint of class.
    The Interface in java is a Mechanism to achieve abstraction.

    Use of Interface-
    - It is used to achieve abstraction
    - By interface, we can support the functionality of multiple inheritance
    - It can be used to achieve loose coupling
    Loose Coupling- In loose coupling, a method or class is almost independent, and they have less depended on each other
                    If the classes or methods know less about each other, the more loosely coupled structure comes into existence
 */

package OOPS_Concept;


interface Printable {       // declare a Printable interface
    void adder();          // create a abstract method of adder name
}

class NaturalNum1 implements Printable {
    // Sum of Natural Numbers from 1 to 5
    int sum=0;
    int num=5;
    @Override
    public void adder() {
        // Using For Loop
        for (int i=1; i<=num; i++){
            sum=sum+i;
        }
        System.out.println("Sum of 1 to 5 is = " + sum);

    }
}
class NaturalNum2 implements Printable{
    // Sum of Natural numbers from 10 to 15
    int sum=0;
    int num=15;

    @Override
    public void adder() {
        for (int i=10; i<=num; i++){
            sum = sum + i;
        }
        System.out.println("Sum of 10 to 15 is " + sum);
    }
}
class InterfaceTest{
    public static void main(String[] args) {
        Printable p1=new NaturalNum1();
        p1.adder();

        // Printable p2=new NaturalNum2();
        // p2.adder();
    }
}



// other Example-------Using for each loop

/*
interface Printable{
    void nameNumber();
}
class NameClass implements Printable{
    String[] names= {"John", "Sam","Angel","Paul"};
    public void nameNumber(){
        for (String name:names){
            System.out.println(name);
        }
    }
}
class NumClass implements Printable{
    public void nameNumber(){
        int[] numbers={1,3,4,8,10};
        for (int number:numbers){
            System.out.println(number);
        }
    }
}
class InterfaceTest{
    public static void main(String[] args) {
       // Printable p2=new NumClass();
       // p2.nameNumber();
    }
}

 */



// Other Example----Using do while loop

/*interface Printable{
    void addNum();
}
class Number1 implements Printable{
    int i=1, num=5;
    public void addNum(){
        while (i<=num){
            System.out.println(i);
            i++;
        }
    }
}
class Number2 implements Printable{
    int i=10, num=20;

    @Override
    public void addNum() {
        while (i<=num){
            System.out.println(i);
            i++;
        }
    }
}
class InterfaceTest{
    public static void main(String[] args) {
        Printable p1=new Number1();
        p1.addNum();
        // Printable p2=new Number2();
        // p2.addNum();
    }
}

 */



// Other Example----using do while loop

/*interface Printable{
    void adder();
}
class AddNumber1 implements Printable{
    public void adder(){
        int sum=0;
        int num=5;
        // Using do while loop
        // Display numbers from 0 to 5
        do {
            System.out.println(sum);
            sum++;
        } while (sum<=num);
    }
}
class AddNumber2 implements Printable{
    public void adder(){
        int sum=10;
        int num=20;
        // Using do while loop
        // Display numbers from 0 to 5
        do {
            System.out.println(sum);
            sum++;
        } while (sum<=num);
    }
}
class InterfaceTest{
    public static void main(String[] args) {
        Printable p1 = new AddNumber1();
        p1.adder();
        // Printable p2=new AddNumber2();
        //  p2.adder();
    }
}

 */