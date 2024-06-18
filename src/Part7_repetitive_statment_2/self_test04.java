package Part7_repetitive_statment_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class self_test04 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tok = new StringTokenizer(br.readLine());
        int  a = Integer.parseInt(tok.nextToken());
        int sum = 0;

        for(int i = a ; i<=100 ; i++ ){
            sum = sum + i ;
        }
        System.out.println(sum);

    }
}
