package Part6_repetitive_statment_1;

import java.util.*;

public class self_test04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = 0;
        boolean a = true;
        int sum = 0;
        int avg = 0;
        int i =0;


        while (a == true) {
            num = scan.nextInt();

            if(num >= 100) {
                sum +=num;
                i+=1;
                a = false;
                System.out.println(sum);
                float z = ((float)(sum))/i;
                String x = String.format("%.1f",z);
                System.out.println(x);
                break;
            }
            else{
                sum +=num;
                i+=1;
            }
        }

    }

}


