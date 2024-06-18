package Part6_repetitive_statment_1;

import java.util.Scanner;

public class test05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        double width = ((double)(num1 * num2))/2;


        boolean a = true;

        while (a == true) {
            num1 = scan.nextInt();
            num2 = scan.nextInt();


            System.out.println("Base = " + num1);
            System.out.println("Hight = " + num2);
            width = ((double)(num1 * num2))/2;
            System.out.println("Triangle width = " +width);
            System.out.printf("Continue? ");
            String ans = scan.next();

            if(ans.equals("y")||ans.equals("Y")){

            }

            else {
                a = false;
                break;
            }

        }
    }
}


