package Java_String;

/**
 Immutable String- In java, String objects are immutable. immutable simply means unmodifiable or unchangeable
 once object is created its data or state can't be changed but a new string is created
 */
public class ImmutableStringExample {
    public static void main(String[] args) {
        String s="Hello java";      // create a variable of string type
        s.concat("Program");    // concate() method append string at the end
        System.out.println(s);     // it will print Hello java because string are immutable objects

        String str="Programming";
        str=str.concat(" Language");
        System.out.println(str);
    }
}
