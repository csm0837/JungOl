package Part3_operator;
import java.util.*;
import java.util.Scanner;

//연산자 - 형성평가5 #115//
public class test05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h1 = scan.nextInt();
        int w1 = scan.nextInt();
        int h2 = scan.nextInt();
        int w2 = scan.nextInt();

        boolean logic1= (h1>h2);
        boolean logic2 = (w1>w2);

        boolean result = logic1 && logic2;

        System.out.print(result);
    }
}
