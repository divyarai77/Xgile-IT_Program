package OOPS_Concept;

class Vehicle {
    void twoWheeler(){
        System.out.println("Its a two wheeler vehicle");
    }
}
class Bike extends Vehicle{
    void twoWheeler(){
        System.out.println("Its two Wheeler vehicle of Black color");

    }

    public static void main(String[] args) {
        Bike b=new Bike();
        b.twoWheeler();
    }
}
