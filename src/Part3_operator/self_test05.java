package Part3_operator;

import java.util.Scanner;


//자가진단 5 #522//
public class self_test05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("");
        int a = scan.nextInt();
        int b = scan.nextInt();


        boolean result1 = (a == b);
        boolean result2 = (a != b);

        System.out.println(result1);
        System.out.println(result2);
    }
}
