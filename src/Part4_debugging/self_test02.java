package Part4_debugging;

import java.io.*;
import java.util.*;

//디버깅 - 자가진단2 #527//
public class self_test02 {
    public static void test02() {
        Scanner scan = new Scanner((System.in));

        int a = scan.nextInt(); // 1번째 입력값을 받아온다
        int b = scan.nextInt();  //2번째 입력값을 받아온다
        double c = (double)a/b; //a를 실수로 변환하고 b로 나눈다
        String d = String.format("%.2f",c);

        System.out.println(a/b+" "+d);
    }


}