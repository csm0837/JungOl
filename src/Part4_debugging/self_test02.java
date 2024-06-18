package Part4_debugging;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


//디버깅 - 자가진단1 #526//
public class self_test01 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        String a = st.nextToken();
        String b = st.nextToken();

        double aa = Double.parseDouble(a);
        double bb = Double.parseDouble(b);
        double ab = aa*bb;
        int result1 = (int)ab;

        int aaa = (int)aa;
        int bbb = (int)bb;

        System.out.println(result1+" "+aaa*bbb);







    }
}