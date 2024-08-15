//********************************************************** */
//target sum approach 1
public class targetsum {
    public static boolean check(int[] arr, int tar) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == tar) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 3, 32, 233, 9 };
        int tar = 13;
        System.out.println(check(arr, tar));
    }
}

// ************************************************************/
// // target sum approach 2
// import java.util.*;

// public class targetsum {
// public int[] twoSum(int[] nums, int target) {
// Map<Integer, Integer> map = new HashMap<>();
// for (int i = 0; i < nums.length; i++) {
// int complement = target - nums[i];
// if (map.containsKey(complement)) {
// return new int[] { map.get(complement), i };
// }
// map.put(nums[i], i);
// }
// throw new IllegalArgumentException("No two sum solution");
// }
// }