package assignment2.calculator;    // creating a package

import java.util.Scanner;     //import Scanner class for taking command line argument

public class TestCalculator {    //create a class TestCalculator
    public static void main(String[] args) {       // created main method

        Scanner sc=new Scanner(System.in);      // created objects of Scanner class

        Calculator cal=new Calculator();     // Creating object of calculator class

        System.out.println("Enter the number");

        cal.x = sc.nextDouble();         // taking input from user

        cal.y = sc.nextDouble();

        // Displaying value of objects20
        cal.addition();
        cal.subtraction();
        cal.multiplication();
        cal.division();
    }

}
