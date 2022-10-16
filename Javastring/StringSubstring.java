package Javastring;
import java.util.Scanner;
public class StringSubstring {
    public static void main(String[] args) {
        System.out.println("Example of string substring() method ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String s1=sc.nextLine();
        System.out.println("Enter the start index ");
        int startIndex = sc.nextInt();

        System.out.println("Enter the last index ");
        int lastIndex = sc.nextInt();
        String res=s1.substring(startIndex,lastIndex);
        System.out.println("The result will be = " + res);
    }
}
