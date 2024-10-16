
//************************************************ */
//bubble sort
import java.util.*;

public class bubblesort {
    public static int[] bubblesort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 214, 143, 90, 2123, 32, 1 };
        int[] sorted = bubblesort(arr);
        for (int i : sorted) {
            System.out.print(i + " ");
        }
    }
}