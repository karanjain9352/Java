import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.println("your no is: " + s);
        String s1 = sc.next();   // print until the first space comes
        //String s1 = sc.nextLine();    // print whole line 
        System.out.println(s1);
        
    }
}

