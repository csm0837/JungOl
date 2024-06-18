package Part3_operator;

import java.util.Scanner;

//연산자 - 형성평가2 #112//
public class test02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.printf("%d / %d = %d...%d",a,b,a/b,a%b);
    }
}
