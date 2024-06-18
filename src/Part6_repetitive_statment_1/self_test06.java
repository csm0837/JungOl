package Part6_repetitive_statment_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class self_test06 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("1. Korea\n" +
                    "2. USA\n" +
                    "3. Japan\n" +
                    "4. China\n" +
                    "number? ");

            int num = scan.nextInt();

            if (num == 1) {
                System.out.println("Seoul");
                System.out.println("");
            } else if (num == 2) {
                System.out.println("Washington");
                System.out.println("");
            } else if (num == 3) {
                System.out.println("Tyokyo");
                System.out.println("");
            }
            else if (num == 4) {
                    System.out.println("Beijing");
                    System.out.println("");
            }
            else {
                break;
            }


            }


        }
    }
