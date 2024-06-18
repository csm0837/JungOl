package Part3_operator;

import java.util.Scanner;


//자가진단 4 #521//
public class self_test04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("");
        int a = scan.nextInt();
        int b = scan.nextInt();

        int c = (a++)*(--b);

        System.out.println(a + " " + b + " " + c);
    }
}
