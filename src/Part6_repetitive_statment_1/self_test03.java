package Part6_repetitive_statment_1;

import java.util.Scanner;

public class self_test03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = 0;

        boolean a = true;

        while (a == true) {
            System.out.print("number? ");
            num = scan.nextInt();

            if(num == 0 ) {
                a = false;
                break;
            }
            else if (num > 0) {
                System.out.println("positive integer");
            }
            else{
                System.out.println("negative number");
            }
        }

    }

}


