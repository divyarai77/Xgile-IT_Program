
package Java_String;

/**
 Generally, String is a sequence of characters. String is basically an object that represent sequence of char value
 java.lang.String class is used to create a string object.
 */
public class StringExample {
    public static void main(String[] args) {
    String s = "Hello World";       // Creating string by using string literal
    char[] c = {'J','A','V','A'};
    String s2 = new String(c);      // Converting char array to string
    String s3 = new String("Programming Language");      // Creating java string by new keyword

    //StringExample se=new StringExample();
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);

    }
}
