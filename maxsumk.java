//maxsum k from contiguous array
import java.util.*;

public class maxsumk {
    public static int contsum(int[] arr, int k) {
        int maxlen = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n - 1; j++) {
                sum = sum + arr[j];
                if (sum <= k) {
                    maxlen = Math.max(maxlen, j - i + 1);
                } else if (sum > k) {
                    break;
                }
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 10, 2 };
        int k = 16;
        System.out.println(contsum(arr, k));
    }
}

// public class maxsumk {
//     public static int contsum(int[] arr, int k) {
//         int maxlen = 0;
//         int left = 0;
//         int sum = 0;
//         int n = arr.length;
//         for (int right = 0; right < n; right++) {
//             sum = sum + arr[right];
//             while (sum < k && left <= right) {
//                 sum = sum - arr[left];
//                 left++;
//             }
//             if (sum <= k) {
//                 maxlen = Math.max(maxlen, right - left + 1);
//             }
//         }
//         return maxlen;
//     }
// }