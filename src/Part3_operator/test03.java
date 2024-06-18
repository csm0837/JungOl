package Part3_operator;

import java.util.Scanner;

//연산자 - 형성평가3 #113//
public class test03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt()+5;
        int h = scan.nextInt()*2;

        System.out.println("width = " + (w) );
        System.out.println("length = " + (h) );
        System.out.println("area = " + (w*h) );
    }
}
