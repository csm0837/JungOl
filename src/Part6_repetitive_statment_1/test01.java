package Part6_repetitive_statment_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class test01 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer tok = new StringTokenizer(str);

        String a = tok.nextToken();
        int b= Integer.parseInt(a);
        int i =1;

        while(i<b+1){
            System.out.print(i+" ");
            i+=1;
        }
    }
}
