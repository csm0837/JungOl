package Part7_repetitive_statment_2;

import java.io.IOException;
import java.util.Scanner;


public class self_test07 {
    public static void main(String[] args) {

        for (int i = 2; i <= 6; i++) {
            System.out.print("\n");

            for(int j=i ; j <= i+4 ; j++){
                System.out.print(j+" ");
            }
        }
    }
}