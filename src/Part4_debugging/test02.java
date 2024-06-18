package Part4_debugging;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


//디버깅 - 형성평가2 #117//
public class test02 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringTokenizer st= new StringTokenizer(str);

        String a =st.nextToken();
        String b =st.nextToken();
        String c =st.nextToken();

        double aa = Double.parseDouble(a);
        double bb = Double.parseDouble(b);
        double cc = Double.parseDouble(c);
        double avg = (aa+bb+cc)/3;
        int avgresult = (int)(avg);

        int aaa = (int)(aa);
        int bbb = (int)(bb);
        int ccc = (int)(cc);
        int sum = aaa+bbb+ccc;

        System.out.println("sum "+sum);
        System.out.println("avg "+avgresult);


    }

}