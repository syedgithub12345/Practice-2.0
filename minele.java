import java.util.*;

public class minele {
    public static int minelement(int[] nums) {
        int min = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String args[]) {
        int[] nums = { 3, 4, 56, 9 };
        int[] nums2 = { 4, 5, 6, 7, 90 };
        int ans = minelement(nums);
        System.out.println(ans);
    }
}