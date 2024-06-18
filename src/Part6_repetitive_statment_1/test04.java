package Part6_repetitive_statment_1;

import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num ;
        int i = 0;
        boolean a = true;

        while(a == true){
            num = scan.nextInt();

            if(num == 0){
                a = false;
                break;

            }
            else if(num%5==0) {
            }
            else if (num%3==0) {
            }
            else i++;
            {

            }
        }
        System.out.println(i);
    }
}


