package Part3_operator;

import java.util.Scanner;

//연산자 - 형성평가4 #114//
public class test04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int c = ++a;
        int d = b--;

        System.out.println(a + " " + d);
        System.out.println(c + " " + b);
    }
}
