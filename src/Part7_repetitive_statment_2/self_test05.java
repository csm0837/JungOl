package Part7_repetitive_statment_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class self_test05 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tok = new StringTokenizer(br.readLine());

        int sam = 0;
        int oh = 0;

        for (int i = 0; i < 10; i++) {
            int a = Integer.parseInt(tok.nextToken());
            if (a % 15 == 0) {
                sam += 1;
                oh += 1;
            } else if (a % 3 == 0) {
                sam += 1;
            } else if (a % 5 == 0) {
                oh += 1;
            } else {
                sam +=0;
                oh +=0;
            }
        }
        System.out.println("Multiples of 3 : "+ sam);
        System.out.println("Multiples of 5 : "+ oh);
    }
}
