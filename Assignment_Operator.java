public class Assignment_Operator {
    public static void main(String[] args) {
        System.out.println("Assignment Operator :");
        int x=20;
        int y=10;
        int z=0;

        z=x+y;
        System.out.println("z=x+y = "+z);
        z+=x;
        System.out.println("z+=x = "+z);
        z-=y;
        System.out.println("z-=y = "+z);
        z*=y;
        System.out.println("z*=y = "+z);
        z/=x;
        System.out.println("z/=x = "+z);
    }
}
