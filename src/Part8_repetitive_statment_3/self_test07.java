package Part8_repetitive_statment_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class self_test07 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer str = new StringTokenizer(br.readLine());

    int line = Integer.parseInt(str.nextToken());
    int count = 1;
    char ch = 'A';

    for (int i = 0; i < line; i++) {
      for (int j = line; i < j; j--) {
        System.out.printf("%d ", count++);
      }

      for (int k = 0; k <= i; k++) {
        System.out.printf("%c ", ch++);
      }
      System.out.print('\n');
    }
  }
}