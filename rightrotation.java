// right rotation
import java.util.*;

public class rightrotation {
    public static int[] rightRotate(int[] arr, int n, int k) {
        int[] temp = new int[n];
        k = k % n;
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }
        for (int i = k; i < n; i++) {
            temp[i] = arr[i - k];
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int k = 2;
        int[] result = rightRotate(arr, n, k);
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
