import java.util.HashSet;

public class StringIntersect {

  public static boolean Intersect(String a, String b, int len) {
    HashSet<String> subStringA = new HashSet<>();
    for (int i = 0; i <= a.length() - len; i++) {
      String sub = a.substring(i, i + len);
      subStringA.add(sub);
    }
    for (int i = 0; i <= b.length() - len; i++) {
      String sub = b.substring(i, i + len);
      if (subStringA.contains(sub)) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {

    String a1 = "banana";
    String b1 = "ananas";
    int len2 = 3;
    System.out.println(
        "a: " + a1 + ", b: " + b1 + ", len: " + len2 + " -> " + Intersect(a1, b1, len2));

    String a2 = "hello";
    String b2 = "world";
    int len3 = 2;
    System.out.println(
        "a: " + a2 + ", b: " + b2 + ", len: " + len3 + " -> " + Intersect(a2, b2, len3));

  }
}
