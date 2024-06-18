package Part7_repetitive_statment_2;

import java.io.*;
import java.util.*;


public class self_test01 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tok = new StringTokenizer(br.readLine());
        String a = tok.nextToken();

        for(int i = 0 ; i<20 ; i++ ){
            System.out.print(a);
        }

    }
}
