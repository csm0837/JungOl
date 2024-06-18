package Part5_selection_statment;

import java.io.*;
import java.util.*;


public class test5 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer tok = new StringTokenizer(str);

        String a = tok.nextToken();
        int b = Integer.parseInt(a);


        switch (b) {
            case 2:
                System.out.println(28);
                break;

            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.println(30);
                break;

            default:
                System.out.println(31);

        }
    }
}
