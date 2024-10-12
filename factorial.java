//factorial using recursion

import java.util.*;

public class factorial {
    public static int factorial(int n) {
        // int fact=1;
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
}
