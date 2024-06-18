package Part8_repetitive_statment_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class self_test06 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer str = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(str.nextToken());

    int a = 65;
    for (int i = n; i >= 1; i--) {

      for (int j = 1; j <= i; j++, a++) {
        System.out.print((char) a);
      }
      System.out.println();
    }


  }

}
