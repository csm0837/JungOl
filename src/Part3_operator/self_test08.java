package Part3_operator;

import java.util.Scanner;


//자가진단 6 #523//
public class self_test08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        boolean first = (a > b && a > c);
        boolean same = (a == b && b == c);

        System.out.println(first + " " + same);
    }
}
