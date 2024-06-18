package Part3_operator;

import java.util.Scanner;


//자가진단 3 #520//
public class self_test03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("");
        int a = scan.nextInt();

        System.out.println(a++);
        System.out.println(++a);
    }
}
