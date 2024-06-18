package Part4_debugging;

import java.io.*;
import java.util.*;


//디버깅 - 자가진단2 #527//
public class self_test02 {
    public static void main(String[] args) {
        test02();
    }


    //디버깅 자가진단1 #526//
    public static void test01(){

        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();

        int c = (int) a;
        int d = (int) b;
        int e = (int) ((double) a*b);

        System.out.println(e + " "+ c*d);
    }

    //디버깅 자가진단2 #527//
    public static void test02() {
        Scanner scan = new Scanner((System.in));

        int a = scan.nextInt(); // 1번째 입력값을 받아온다
        int b = scan.nextInt();  //2번째 입력값을 받아온다
        double c = (double)a/b; //a를 실수로 변환하고 b로 나눈다
        String d = String.format("%.2f",c);

        System.out.println(a/b+" "+d);
    }


}