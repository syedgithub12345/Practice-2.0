// left rotation
import java.util.*;

public class leftrotation {
    public static int[] leftRotate(int[] arr, int n, int k) {
        int[] temp = new int[n];
        k = k % n;
        for (int i = 0; i < n - k; i++) {
            temp[i] = arr[i + k];
        }
        for (int i = n - k; i < n; i++) {
            temp[i] = arr[i - (n - k)];
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int k = 2;
        int[] result = leftRotate(arr, n, k);
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
