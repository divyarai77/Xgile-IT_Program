package assignment2.calculator;      // create a package

public class Calculator {         // create a class Calculator
    double x;                  // declared a variable x
    double y;                  // declared a variable y

    public Calculator() {      // create a non parameterized constructor
        System.out.println("non parametrized constructor");
    }
    public Calculator(double num1, double num2){      // create a parameterized constructor
        x=num1;
        y=num2;
    }

    void addition(){    // created a method addition which add the value of x and y and store tha value in sum
        double sum=x+y;
        System.out.println("The addition of two number is " + sum);   // Print the value of sum
    }

    void subtraction(){    // created a method subtraction which subtract the value of x and y and store tha value in sub
        double sub=x-y;
        System.out.println("The subtraction of two number is " + sub);   // Print the value of sub
    }

    void multiplication(){    // created a method multiplication which multiply the value of x and y and store tha value in multiply
        double multiply=x*y;
        System.out.println("The multiplication of two number is " + multiply);   // Print the value of multiply
    }

    void division(){    // created a method division which divide the value of x and y and store tha value in divide
        double divide=x/y;
        System.out.println("The division of two number is " + divide);   // Print the value of divide
    }

}
