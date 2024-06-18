package Part6_repetitive_statment_1;

import java.io.IOException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        boolean a = true;

        while (a == true){
            num = scan.nextInt();

        if (num < 101) {
            sum += num;
        }
        else {
            a = false;
        }
    }
        System.out.println(sum);


    }
}

