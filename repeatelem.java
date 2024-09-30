
//repeating elements in an array
import java.util.*;

public class repeatelem {
    public static boolean repeat(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 1, 3, 4, 2, 23, };
        System.out.println(repeat(arr));
    }
}
