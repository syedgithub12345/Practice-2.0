//******************************************************** */
// bubble sort
//bubble sort- n^2 time complexity
import java.util.*;

public class bubble {
    public static int[] bubble_sort(int n, int[] arr) {
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubble_sort(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}