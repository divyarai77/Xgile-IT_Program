package OOPS_Concept;
/* Encapsulation is a process of wrapping code and data into a single unit
     Encapsulation is achieved by declaring the variable as private and providing public setter and getter method to modify
     and view the variable value
 */

public class EncapsulationExample {
   private String name;
   public String getName(){
       return name;
   }
   public void setName(String name){
       this.name=name;
   }
}
