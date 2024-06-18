package Part8_repetitive_statment_3;


import java.io.*;
import java.util.*;

public class self_test01 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tok = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(tok.nextToken());
        int sum = 0;
        int count = 0;

        int i = 0;
        for (i = 0 ; sum < n ; i++) {
            if (i % 2 == 1) {
                sum = sum +i;
                count++;}
            else{
                System.out.printf("");}
        }
        System.out.println(count +" "+sum);
    }
}
