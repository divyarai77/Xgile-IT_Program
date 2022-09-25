package assignment1.animalpackage;

public class Animal {
    // Use of private modifier
    private String name;
    public String getName() {     // getter method
        return this.name;
    }
    public void setName(String name){     // setter method
        this.name=name;
    }

    // Use of protected method
    protected void display(){
        System.out.println("I am an animal");
    }

    // Use of public modifier
    public int legCount;        // public variable
    public void displayLegCount(){      // public method
        System.out.println("I have " + legCount + " legs");
    }
}
