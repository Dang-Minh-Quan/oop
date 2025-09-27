import java.util.Scanner;

public class MaxRun {

  public static int maxRun(String s) {
    int maxStringLength = 0;
    int currentStringLength = 1;

    if (s.length() == 0) {
      return 0;
    }
    if (s.length() == 1) {
      return 1;
    }
    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) == s.charAt(i - 1)) {
        currentStringLength++;
      } else {
        maxStringLength = Math.max(maxStringLength, currentStringLength);
        currentStringLength = 1;
      }
    }
    return Math.max(maxStringLength, currentStringLength);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (1 != 0) {
      String s = sc.nextLine();
      System.out.println(s + "->" + maxRun(s));
    }

  }
}
