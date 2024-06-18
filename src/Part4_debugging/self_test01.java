package Part4_debugging;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//디버깅 - 연습문제1 #9027//
public class practice01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        String a =st.nextToken();
        String b =st.nextToken();

        double aa = Double.parseDouble(a);
        double bb = Double.parseDouble(b);

        int result1 = (int)(aa+bb); //실수의 합을 정수로 변환

        int aaa = (int)aa;
        int bbb = (int)bb;
        int result2 = aaa + bbb;

        System.out.println(result1+" "+result2);

    }

}
