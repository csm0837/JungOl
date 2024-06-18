package Part3_operator;

import java.util.Scanner;


//자가진단 6 #523//
public class self_test06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("");
        int a = scan.nextInt();
        int b = scan.nextInt();

        boolean result1 = (a > b);
        boolean result2 = (a < b);
        boolean result3 = (a >= b);
        boolean result4 = (a <= b);

        System.out.println(a+" > "+b+" --- " + result1);
        System.out.println(a+" < "+b+" --- " + result2);
        System.out.println(a+" >= "+b+" --- " + result3);
        System.out.println(a+" <= "+b+" --- " + result4);
    }
}
