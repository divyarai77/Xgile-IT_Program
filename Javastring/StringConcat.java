package Javastring;
import java.util.Scanner;     // import scanner class
public class StringConcat {   // create a class with stringConcat name
    public static void main(String[] args) {       // create a main method
        System.out.println("Example of String Concatenation");
        Scanner sc=new Scanner(System.in);      // create an object of scanner class
        System.out.println("Enter the String ");
        String s1=sc.nextLine();      // take an input from user
        System.out.println("Enter second String ");
        String s2=sc.nextLine();      // take another input from user
        String res=s1.concat(s2);     // concatenate the one string to another string
        System.out.println("the result of concatenation is :  ");
        System.out.println(res);      // print the result
    }
}
