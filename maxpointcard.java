//maximum points you can obtain from card
import java.util.*;

public class maxpointcard {
    public int maxPoints(int[] nums, int k) {
        int lsum = 0;
        int rsum = 0;
        int maxsum = 0;
        for (int i = 0; i < k; i++) {
            lsum += nums[i];
        }
        int n = nums.length;
        maxsum = lsum;
        int ridx = n - 1;
        for (int i = k - 1; i >= 0; i--) {
            lsum = lsum - nums[i];
            rsum = rsum + nums[ridx];
            ridx = ridx - 1;
            maxsum = Math.max(maxsum, lsum + rsum);
        }
        return maxsum;
    }
}