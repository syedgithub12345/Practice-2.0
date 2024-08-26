
//sort an array of 0s, 1s and 2s
//dutch national flag algorithm
import java.util.*;

public class sortarray012 {
    public static void sortArray(ArrayList<Integer> arr, int n) {
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            if (arr.get(mid) == 0) {
                Collections.swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr.get(mid) == 1) {
                mid++;
            } else {
                Collections.swap(arr, mid, high);
                high--;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 2, 2, 2, 0, 0, 1,
                0));
        sortArray(arr, arr.size());
        System.out.println(arr); // Output should be [0, 0, 0, 1, 2, 2, 2, 2]
    }
}