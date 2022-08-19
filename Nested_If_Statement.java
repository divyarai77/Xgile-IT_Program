public class Nested_If_Statement {
    public static void main(String[] args) {
        System.out.println("Nested If Statement :");
        int age=25;
        int weight=60;
        if(age>18){
            if(weight>55){
                System.out.println("You are eligible for vote");
            }
        }

        // Second Example------------

        if(age>18){
            if(weight>60){
                System.out.println("You are eligible for Driving");
            }
            else {
                System.out.println("You are not eligible for Driving");
            }
        }
        else{
            System.out.println("Age is not valid");
        }
    }
}
