public class IfElse_Statement {
    public static void main(String[] args) {
        System.out.println("If Else Statement :");
        int marks=60;
        if(marks>65){
            System.out.println("First Division");
        }
        else {
            System.out.println("Second Division");
        }

        // Second Example-------

        int num=17;
        if(num%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }

        // third Example--------

        int year=2022;
        if((year%4==0) && (year%100!=0)){
            System.out.println("this Year is a leap year");
        }
        else {
            System.out.println("This year is not a leap year");
        }
    }
}
