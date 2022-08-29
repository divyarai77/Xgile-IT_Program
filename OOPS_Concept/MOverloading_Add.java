package OOPS_Concept;

// If a class has multiple method having same name but different i parameters is known as method overloading.

public class MOverloading_Add {
    //changing no of arguments
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }

}
class OverloadingTest{
    public static void main(String[] args) {
        System.out.println(MOverloading_Add.add(10,20));
        System.out.println(MOverloading_Add.add(20,20,20));
    }
}



// By changing data type og arguments

/*class Adder{
    static int Add(int a, int b){
        return a+b;
    }
    static float add(float a, float b){
        return a+b;
    }
}
class Overload{
    public static void main(String[] args) {
        System.out.println(Adder.Add(10,10));
        System.out.println(Adder.add(20.25f,30.50f));
    }
}

 */
