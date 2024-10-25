//count sum
public class countsum {
    public static int countsumm(int[] arr, int k) {
        int left = 0;
        int sum = 0;
        int maxlen = 0;
        int n = arr.length;
        for (int right = 0; right < n - 1; right++) {
            sum += arr[right];
            while (sum < k && left <= right) {
                sum = sum - arr[left];
                left++;
            }
            if (sum <= k) {
                maxlen = Math.max(maxlen, right - left + 1);
            }
        }
        return maxlen;
    }
}
