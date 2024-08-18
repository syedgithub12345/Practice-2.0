//union sorted array unique
import java.util.*;

public class unionarray {
    public static List<Integer> sortedArray(int[] a, int[] b) {
        int n = a.length + b.length;
        int[] ans = new int[n];

        int i = 0;
        for (i = 0; i < a.length; i++) {
            ans[i] = a[i];
        }
        int k = 0;
        for (int j = 0; j < b.length; j++) {
            ans[i] = b[k];
            k++;
            i++;
        }

        Arrays.sort(ans);
        List<Integer> sorted = new ArrayList<>();
        for (i = 0; i < n; i++) {
            if (i == 0 || ans[i] != ans[i - 1]) {
                sorted.add(ans[i]);
            }
        }

        return sorted;
    }
}