package Part7_repetitive_statment_2;

import java.io.*;
import java.util.*;


public class self_test03 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tok = new StringTokenizer(br.readLine());
        int  a = Integer.parseInt(tok.nextToken())/2;

        for(int i = 1 ; i<=a ; i++ ){
            System.out.print(i*2 + " ");
        }

    }
}
