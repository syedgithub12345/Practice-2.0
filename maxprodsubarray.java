//maxproductsubarray
import java.util.*;

public class maxprodsubarray {
    public static int subarrayWithMaxProduct(int[] arr) {
        int n = arr.length;
        int j;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int prod = 1;
            for (j = i; j < n; j++) {
                prod *= arr[j];
                max = Math.max(prod, max);
            }
        }
        return max;
    }
}

// or
// public class Solution {
// public static int subarrayWithMaxProduct(int[] arr) {
// int prefix = 1;
// int suffix = 1;
// int n = arr.length;
// int max = Integer.MIN_VALUE;
// for (int i = 0; i < n; i++) {
// if (suffix == 0)
// suffix = 1;
// if (prefix == 0)
// prefix = 1;
// prefix *= arr[i];
// suffix *= arr[n - i - 1];
// max = Math.max(max, Math.max(prefix, suffix));
// }
// return max;
// }
// }
