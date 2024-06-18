package Part5_selection_statment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class test03 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer tok = new StringTokenizer(str);


        int a = Integer.parseInt(tok.nextToken());

        System.out.println((a%400)==0 ||((a%4==0)&&(a%100!=0))? "leap year":"common year");
    }
}
