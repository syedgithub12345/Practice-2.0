//*************************************** */
public class sqsort {
    public int[] sortsquare(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = arr[i] * arr[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}