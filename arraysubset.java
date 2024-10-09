//Check if array is subset of another array
import java.util.*;

public class arraysubset {
    public static boolean cheacksubarray(int[] arr1, int[] arr2, int m, int n) {
        if (m > n)
            return false;
        for (int i = 0; i < m; i++) {
            boolean ans = false;
            for (int j = 0; j < n; j++) {
                if (arr1[i] == arr2[j]) {
                    ans = true;
                    break;
                }
            }
            if (ans == false) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = { 3, 2, 43, 21, 2 };
        int[] arr2 = { 1, 2, 3, 4, 44, 4, 1, 2, 2 };
        int m = arr1.length;
        int n = arr2.length;
        System.out.println(cheacksubarray(arr1, arr2, m, n));
    }
}