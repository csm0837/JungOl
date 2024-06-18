package Part3_operator;

import java.util.Scanner;


//자가진단 6 #523//
public class self_test07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("");
        int a = scan.nextInt();
        int b = scan.nextInt();

        boolean result1 = (a != 0);
        boolean result2 = (b != 0);

        boolean result3 = result1&&result2;
        boolean result4 = result1||result2;

        System.out.println(result3 + " " + result4);
    }
}
