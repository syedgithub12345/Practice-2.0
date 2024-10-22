//maximum number of 1
import java.util.*;

public class max1 {
    public static int maximum1(int[] arr, int k) {
        int maxlen = 0;
        for (int i = 0; i < arr.length; i++) {
            int zeroes = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 0) {
                    zeroes++;
                }
                if (zeroes <= k) {
                    int len = j - i + 1;
                    maxlen = Math.max(maxlen, len);
                } else {
                    break;
                }
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 1, 0, 1 };
        int k = 1;
        System.out.println(maximum1(arr, k));
    }
}