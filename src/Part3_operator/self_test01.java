package Part3_operator;

import java.util.Scanner;


//자가진단 1 #518//
public class self_test01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println("sum : " + (a+b+c));
        System.out.println("avg : " + (a+b+c)/3);
    }
}
