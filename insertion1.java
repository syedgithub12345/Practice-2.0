
// ****************************** */
//add elemnt inside an array
import java.util.*;

public class insertion1 {
    public static int[] insertion(int[] arr, int n, int value) {
        int l = arr.length;
        int[] ans = new int[l + 1];
        for (int i = 0; i < n; i++) {
            ans[i] = arr[i];
        }
        ans[n] = value;
        for (int i = n + 1; i < l + 1; i++) {
            ans[i] = arr[i - 1];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] ans = insertion(arr, 2, 10);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}