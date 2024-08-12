//************************************************************* */
//merge sort using recursion
import java.util.*;

public class merge {
    public static void mergesort(int[] arr, int low, int high) {
        if (low < high) { // base case for recursion
            int mid = (low + high) / 2;
            mergesort(arr, low, mid);
            mergesort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = 0; i < temp.size(); i++) {
            arr[low + i] = temp.get(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 32, 32, 44, 4, 1 };
        int low = 0;
        int high = arr.length - 1;
        mergesort(arr, low, high);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
