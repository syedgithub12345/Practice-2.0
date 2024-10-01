
// symmetric pairs
import java.util.*;

public class symmetricpairs {
    public static void symmetricpair(int[][] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[j][0] == nums[i][1] && nums[j][1] == nums[j][0]) {
                    System.out.println(nums[i][0] + " " + nums[i][1]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] nums = { { 1, 2 }, { 2, 1 }, { 5, 4 }, { 4, 4 }, { 5, 5 } };
        symmetricpair(nums);
    }
}