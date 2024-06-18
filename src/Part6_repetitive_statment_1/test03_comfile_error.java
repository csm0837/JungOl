package Part6_repetitive_statment_1;

import java.util.Scanner;

public class test03_comfile_error {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num ;
        int sum = 0;
        float avg = 0.0f;
        boolean a = true;
        int i = 0;

        while(a == true){
            num = scan.nextInt();

            if (num<=100) {
                sum = sum + num;
                i = i +1;
            }
            else {
                a = false;
                break;
            }
        }
        System.out.println("sum : "+sum);
        System.out.println("avg : "+(float)(sum) / i);
    }


    }


