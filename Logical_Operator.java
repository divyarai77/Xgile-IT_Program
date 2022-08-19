class Logical_Operator {
    public static void main(String[] args) {
        System.out.println("Logical & Bitwise Operator :");
        int x=10;
        int y=20;
        System.out.println(x<20 && y>x);
        System.out.println(x>20 && y==20);
        System.out.println(x<20 & y>x);


        int a=50;
        int b=30;
        System.out.println(a>b || b>a);
        System.out.println(a==b || b==a);
        System.out.println(a>b | b>a);

        boolean u=true;
        boolean v=false;
        System.out.println(!(u&&v));


    }
}
