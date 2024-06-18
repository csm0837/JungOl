package Part6_repetitive_statment_1;

import java.util.*;

public class self_test05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = 0;
        boolean a = true;


        while (a == true) {

            num = scan.nextInt();

            if(num%3==0) {
                System.out.println(num/3);
            }
            else if (num+1==0) {
                a = false;
                break;
            }
            else{
            }
        }

    }

}


