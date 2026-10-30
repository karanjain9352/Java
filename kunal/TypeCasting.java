
import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args){
        // // automatic coversion
        // // that source is greater than destination ex. int convert automatic to float but float not convert to int 
        // Scanner sc = new Scanner(System.in);
        // float num = sc.nextInt();  // that is correct
        // System.out.println(num);
        // //int num1 = sc.nextFloat();    // this is error that int can't take float input 


        // // typeCasting
        // int n = (int)(32.20);
        // System.out.println(n);

        // automatic type promotion in expression 
        int a = 257;
        byte b = (byte)(a);
        System.out.println(b);

        byte c = 40;
        byte d = 50;
        byte e = 100;
        int f = (c*d) / e;    // here c*d is 2000 but byte goes upto 256 so automatic to int that is 'automatic type promotion in expression'
        System.out.println(f);

        // byte b = 50;
        // b = b*2;  // can not do that bcz the b*2 is become int and we insert it in byte so can't compatible we do it by explicitly

        int number = 'A';
        System.out.println(number);
    }
}
