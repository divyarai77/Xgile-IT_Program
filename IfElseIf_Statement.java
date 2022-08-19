public class IfElseIf_Statement {
    public static void main(String[] args) {
        System.out.println("If Else If Statement :");
        int marks=60;
        if(marks<50){
            System.out.println("Fail");
        } else if (marks>=50 && marks<60) {
            System.out.println("D Grade");
        } else if (marks>=60 && marks<70) {
            System.out.println("C Grade");
        } else if (marks>=70 && marks<80) {
            System.out.println("B Grade");
        } else if (marks>=80 && marks<90) {
            System.out.println("A Grade");
        }
        else {
            System.out.println("Invalid Data");
        }

        // Second Example-------

        System.out.println("Check Positive and Negative Number :");
        int num=-15;
        if(num>0){
            System.out.println("Number is Positive");
        } else if (num<0) {
            System.out.println("Number is Negative");
        }
        else {
            System.out.println("Number is Zero");
        }
    }
}
