import java.util.Arrays;
import java.util.Scanner;

public class lec10 {
    static void greet(){                                  // we se satic bcz without making obj of class lec10 
        System.out.println("Hello! from greet");
    }
    static String greet1(){
        return "Hello! from greet1";
    }
    static int sum(int a, int b){
        return a+b;
    }
    static void swap(int a, int b){             
        int temp = a;
        b = a;
        b = temp;
    }
    static void change(int[] nums){
        nums[2] = 85;
    }

    static void varags(int ... v){
        System.out.println(Arrays.toString(v));
    }

    static boolean isPrime(int n){
        if(n<=1) return false;
        int a = 0;
        for(int i=2;n<=i*i;i++){
            if(n%i==0){
                a = 1;
                break;
            }
        }
        if(a==1) return true;
        else return false;
    }
    public static void main(String[] args){
        // greet();
        // String message = greet1();
        // System.out.println(message);

        // int res = sum(20,30);
        // System.out.println(res);

        // int a = 10;
        // int b = 20;
        // swap(a,b);
        // System.out.println(a + " " + b);     // not swapped bcz primitive 

    
        // int arr[] = {10,20,70,52};
        // change(arr);
        // System.out.println(Arrays.toString(arr));         // change the original array also bcz array is treat as Object


        // // Multiple arguments
        // varags(2,58,5,22,14,74);


        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);

    }
}










// Shadowing
// public class lec10 {
//     static int x = 90;
//     static void fun(){
//         System.out.println(x);
//     }
//     public static void main(String[] args) {
//         System.out.println(x);     // Prints 90
//         int x = 20;
//         System.out.println(x);   // Prints 20        // the class vaiable at line 52 is shadowed bby this
//         fun();
//     }
// }