package Part5_selection_statment;
import java.io.*;
import java.util.*;


public class tset01 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer tok = new StringTokenizer(str);



        int a = Integer.parseInt(tok.nextToken());
        int b = Integer.parseInt(tok.nextToken());

        int result = a < b ? b-a : a-b;

        System.out.println(result);

    }
}
