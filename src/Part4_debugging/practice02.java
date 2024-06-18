package Part4_debugging;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

//디버깅 - 연습문제2 #9028//
public class practice02 {
    public static void main(String[] args) throws  IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        String a = st.nextToken();
        int aa = Integer.parseInt(a);

        int x = 4;
        float y = 4.0f;

        System.out.println(aa + " / "+ x +" = " +(int)aa/x);
        System.out.println(aa + " / "+ y +" = " +(float)aa/y );

    }

}
