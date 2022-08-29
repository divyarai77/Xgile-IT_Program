package OOPS_Concept;

/* There are three ways to initialize objects
    1. By reference variable
    2. By method
    3. By constructor
 */

class Student {
    int id;
    String name;
}

 class StudentTest{
    public static void main(String[] args) {
        System.out.println("Object and class examples :");
        Student s=new Student();
        s.id=101;                     // Initialize through reference
        s.name="Divya Rai";
        System.out.println("ID :" +s.id);
        System.out.println("Name :"+ s.name);
    }
}


// Initialize through method--------

/*class Student{
    int rollno;
    String name;
    void insertDetails(int r,String n){
       rollno=r;
       name=n;
    }
    void displayDetails(){
        System.out.println(rollno+" "+ name);

    }
}

class StudentTest{
    public static void main(String[] args) {
        Student s=new Student();
        Student s2=new Student();
        s.insertDetails(200,"Angel");   // Initialize through Method
        s2.insertDetails(201,"Boby");
        s.displayDetails();
        s2.displayDetails();
    }
}

 */
