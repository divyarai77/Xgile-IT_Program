public class Unary_Operator {
    public static void main(String[] args) {
        System.out.println("Unary Operator");
        int x=50;
        System.out.println("Post Increment: "+x++);
        System.out.println("Pre Increment: "+(++x));
        System.out.println("Post Decrement: "+x--);
        System.out.println("Pre Decrement: "+(--x));

        // Second Example----

        int a=10;
        int b=20;
        System.out.println(a++ + b++);
        System.out.println(a-- + b--);
        System.out.println(--a + --b);
        System.out.println(++a + ++b);
        System.out.println(a++ + --b);
        System.out.println(a-- - b--);
    }
}
