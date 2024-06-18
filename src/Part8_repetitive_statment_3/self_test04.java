package Part8_repetitive_statment_3;

import java.io.*;
import java.util.*;

public class self_test04 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer str = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(str.nextToken());

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i > j) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      System.out.println("");
    }
  }
}