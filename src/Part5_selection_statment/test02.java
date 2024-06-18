package Part5_selection_statment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class test02 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer tok = new StringTokenizer(str);


        int a = Integer.parseInt(tok.nextToken());

        if (a == 0) {
            System.out.println("zero");
        } else if (a > 0) {
            System.out.println("plus");
        } else {
            System.out.println("minus");

        }
    }
}
