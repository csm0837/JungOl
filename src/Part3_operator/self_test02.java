package Part3_operator;

import java.util.Scanner;


//자가진단 2 #519//
public class self_test02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("");
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(a+100 + " " + b%10);
    }
}
