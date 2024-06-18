package Part8_repetitive_statment_3;

import java.io.*;
import java.util.*;


public class self_test03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(str.nextToken()) + 1;
        boolean up_down = true;



        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.println("");
        }


    }
}


//n을 입력 받기
//별을 n개 찍고 n을 1까지감소시키기
//별을 1개 찍고 n개까지 증가시키기