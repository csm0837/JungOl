package Part7_repetitive_statment_2;

import java.io.IOException;
import java.util.Scanner;


public class self_test06_fail {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();

        int score = 0;

        for (int i = 0; i < n; i++) {


            Scanner scorr = new Scanner(System.in);
            int each =sc.nextInt();

            score += each;

        }
        double d_score = (double)(score);
        System.out.println("avg : "+d_score/n);


        if ((d_score/n) >=80) {
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }

    }
}
