package Part6_repetitive_statment_1;
import java.io.*;
import java.util.*;

public class self_test02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        String a = st.nextToken();
        int b = Integer.parseInt(a);
        int i = 1;
        int sum = 0;


        while (i<(b+1)) {
            sum = sum+i;
            i= i+1;
        }
        System.out.println(sum);

    }
}
