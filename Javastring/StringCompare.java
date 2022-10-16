package Javastring;
import java.util.Scanner;     // import scanner class
public class StringCompare {    // create a class

    public static void main(String[] args) {     // created a main method
        Scanner sc=new Scanner(System.in);       // created an object of scanner class
        /** by using equals() method */

        System.out.println("Enter the First String");
        String s1=sc.next();      // take string input from user
        System.out.println("Enter the Second String");
        String s2=sc.next();      // take another string from user
        if(s1.equals(s2)){
            System.out.println("First String is equal to second String ");
        }
        else{
            System.out.println("String is not equal");
        }

        /** by using == operator */
        System.out.println("example of ==operator ");
        System.out.println("Enter the First name");
        String name1=sc.next();      // take string input from user
        System.out.println("Enter the Second name");
        String name2=sc.next();      // take another string from user
        if(name1==name2){
            System.out.println("the result of both reference is same");
        }
        else{
            System.out.println("reference is not same");
        }

        /** by using compareTo() method */
        System.out.println("Example of compareTo() method ");
        System.out.println("Enter the First Object");
        String obj1=sc.next();      // take string input from user
        System.out.println("Enter the Second object");
        String obj2=sc.next();      // take another string from user
        System.out.println(obj1.compareTo(obj2));

    }
}
