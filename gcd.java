
//gcd of two number
import java.util.*;

public class gcd {
    public static int gcd(int a, int b) {
        int gcd = 1;
        for (int i = 1; i < Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        System.out.println("gcd of " + a + " and " + b + " is " + gcd(a, b));
    }
}