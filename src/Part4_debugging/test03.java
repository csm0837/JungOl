package Part4_debugging;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


//디버깅 - 형성평가3 #118//
public class test03 {
    public static void main(String[] args) {

        int a = 5;
        a += 10;
        a = a - 1;
        System.out.printf("%d\n", ++a);
    }
}