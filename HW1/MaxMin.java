import edu.princeton.cs.algs4.StdIn;

public class MaxMin {
    public static void main (String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (!StdIn.isEmpty()) {
            int temp = StdIn.readInt();
            if (temp > max) {
                max = temp;
            } else if (temp < min) {
                min = temp;
            }
        }
        System.out.println(max+" "+min);
    }
}
