package Part3_operator;
import java.util.*;

//연산자 - 형성평가1 #111//
public class test01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        System.out.println("sum " + (a + b + c + d));
        System.out.println("avg " + (a + b + c + d) / 4);
    }
}
