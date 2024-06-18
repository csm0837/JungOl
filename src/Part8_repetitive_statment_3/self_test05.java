package Part8_repetitive_statment_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import org.w3c.dom.ls.LSOutput;

public class self_test05 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer str = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(str.nextToken());

    for (int i = 0; i < n; i++) {
      for (int k = 0; k < i; k++) {
        System.out.print(" ");
      }

      for (int j = 0; j < (2 * (n - i) - 1); j++) {
        System.out.print("*");
      }

      System.out.print('\n');
    }
  }
}