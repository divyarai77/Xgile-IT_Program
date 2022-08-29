package OOPS_Concept;

// The interface is a mechanism to achieve abstraction and multiple inheritance in java

interface ObjectShape {
   void draw();
}
class Rectangle1 implements ObjectShape{
   public void draw(){
      System.out.println("Draw a Rectangle");
   }
}
class Triangle1 implements ObjectShape{
   public void draw(){
      System.out.println("Draw a Triangle");
   }
}
class ObjectShapeTest{
   public static void main(String[] args) {
      ObjectShape os=new Triangle1();
      os.draw();
   }
}


// Multiple inheritance in java

/*interface PrintStatement{
   void print();
}
interface ShowStatement{
   void show();
}
class Statement implements PrintStatement,ShowStatement{
   public void print(){
      System.out.println("Hello from PrintStatement");
   }
   public void show(){
      System.out.println("Hello from ShowStatement");
   }

   public static void main(String[] args) {
      Statement s=new Statement();
      s.print();
      s.show();
   }
}

 */
