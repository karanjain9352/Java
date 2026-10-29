import java.util.Scanner;

public class Lec9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // int max = a;
        // if(b>max){
        //     max = b;
        // }
        // if(c>max){
        //     max = c;
        // }
        // System.out.println(max);

        // System.out.println(Math.max(a,b));



        // char ch = sc.next().trim().charAt(0);     // trim is just for removinf spaces     // charAt(0) -> first character of word is taken as input here
        // System.out.println(ch);

        // if(ch >= 'a' && ch <= 'z') System.out.println("Lower-Case");
        // else System.out.println("Upper-Case");



        // Fibbonaci

        //int n = sc.nextInt();
        // int a = 0;
        // int b = 1;
        // int count = 2;

        // while(count <= n){
        //     int temp = b;
        //     b = b+a;;
        //     a = temp;
        //     count++;
        // }
        // System.out.println(b);
        


        // Occurence of one number 
        // int n = 45532363;
        // int target = 3;
        // int count = 0;
        // while(n>0){
        //     int rem = n%10;
        //     if(rem == target) count++;
        //     n = n/10;
        // }
        // System.out.println(count);



        // Reverse a number
        int n = 52879;
        int ans = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            ans = ans*10 + rem;
        }
        System.out.println(ans);
        
    }
}
 