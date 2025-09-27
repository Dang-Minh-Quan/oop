import java.util.Scanner;

public class StringBlowup {

  public static String blowup(String str) {
    StringBuilder result = new StringBuilder();
    int n = str.length();

    for (int i = 0; i < n; i++) {
      char currentChar = str.charAt(i);

      if (Character.isDigit(currentChar)) {

        int repeatCount = Character.getNumericValue(currentChar);

        if (i < n - 1) {
          char charToRepeat = str.charAt(i + 1);

          for (int k = 0; k < repeatCount; k++) {
            result.append(charToRepeat);
          }
        }

      } else {
        result.append(currentChar);
      }
    }

    return result.toString();
  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (1 != 0) {
      String s = sc.nextLine();
      System.out.println(s + "->" + blowup(s));
    }

  }
}
