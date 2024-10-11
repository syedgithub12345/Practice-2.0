// ************************************************** */
//Maximum and Minimum Digit in a Number
import java.util.*;

public class maxmindigit {
    private static void minmax(int n) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int d;
        while (n > 0) {
            d = n % 10;
            min = Math.min(min, d);
            max = Math.max(max, d);
            n = n / 10;
        }
        System.out.println(max);
        System.out.println(min);
    }

    public static void main(String[] args) {
        int n = 4726;
        minmax(n);
    }
}