//************************************************* */
//equilibrium position
import java.util.*;

public class equilibrium {
    public static int sum(int[] arr) {
        int lsum, rsum;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            lsum = 0;
            for (int j = 0; j < i; j++) {
                lsum += arr[j];
            }
            rsum = 0;
            for (int k = i + 1; k < n; k++) {
                rsum += arr[k];
            }
            if (lsum == rsum) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 7, 4 };
        System.out.println(sum(arr));
    }
}
