package Part5_selection_statment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class test04 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer tok = new StringTokenizer(str);


        String a = tok.nextToken();
        int b= Integer.parseInt(tok.nextToken());

        switch (b) {

            case 1:
                System.out.println("dog");
                break;

            case 2:
                System.out.println("cat");
                break;

            case 3:
                System.out.println("chick");
                break;

            default:
                System.out.println("I don't know");

        }
    }
}
