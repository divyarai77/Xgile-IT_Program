public class Array_Example {
    public static void main(String[] args) {
        System.out.println("Array Example :");
        int arr[]=new int[5];
        arr[0]=100;
        arr[1]=200;
        arr[2]=300;
        arr[3]=400;
        arr[4]=500;
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        // Another Way

        int a[]={20,10,45,39,40};
        for (int x=0; x<a.length;x++){
            System.out.println(a[x]);
        }

        // Multidimensional Array---------

        System.out.println("Multidimensional Array");
        int num[][]={{10,20,30,},{40,50,60}};
        for (int k=0;k< num.length; ++k){
            for (int j=0;j< num[k].length;++j){
                System.out.println(num[k][j]);
            }
        }

        // Second example----------

        String str[][]={{"Ram","Shyam","Hariom"},{"Sita","Gita","Divya"}};
        for(int s=0;s<str.length;++s){
            for(int b=0;b<str[s].length;++b){
                System.out.println(str[s][b]);
            }
        }
    }
}
