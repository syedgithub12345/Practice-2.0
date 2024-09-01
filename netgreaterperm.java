//next greater permutation
import java.util.*;

public class netgreaterperm {
    public static List<Integer> nextGreaterPermutation(List<Integer> A) {
        int n = A.size();
        int idx = -1;

        // Step 1: Find the first pair of elements (A[i], A[i+1]) where A[i] < A[i+1]
        for (int i = n - 2; i >= 0; i--) {
            if (A.get(i) < A.get(i + 1)) {
                idx = i;
                break;
            }
        }

        // If no such pair is found, reverse the entire list to get the smallest
        // permutation
        if (idx == -1) {
            Collections.reverse(A);
            return A;
        }

        // Step 2: Find the smallest element to the right of idx that is greater than
        // A[idx]
        for (int i = n - 1; i > idx; i--) {
            if (A.get(i) > A.get(idx)) {
                // Step 3: Swap the elements at idx and i
                Collections.swap(A, i, idx);
                break;
            }
        }

        // Step 4: Reverse the subarray to the right of idx
        reverse(A, idx + 1, n - 1);
        return A;
    }

    // Utility function to reverse a subarray
    private static void reverse(List<Integer> A, int start, int end) {
        while (start < end) {
            Collections.swap(A, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println(nextGreaterPermutation(A)); // Output: [1, 3, 2]

        List<Integer> B = new ArrayList<>(Arrays.asList(3, 2, 1));
        System.out.println(nextGreaterPermutation(B)); // Output: [1, 2, 3]

        List<Integer> C = new ArrayList<>(Arrays.asList(1, 1, 5));
        System.out.println(nextGreaterPermutation(C)); // Output: [1, 5, 1]
    }
}

// //or
// class Solution {
// public void nextPermutation(int[] nums) {
// int n = nums.length;
// int idx = -1;

// // Step 1: Find the first index 'idx' from the end where nums[idx] < nums[idx
// + 1]
// for (int i = n - 2; i >= 0; i--) {
// if (nums[i] < nums[i + 1]) {
// idx = i;
// break;
// }
// }

// // Step 2: If no such index is found, the array is in descending order.
// Reverse the array.
// if (idx == -1) {
// reverse(nums, 0, n - 1);
// return;
// }

// // Step 3: Find the first index 'j' from the end where nums[j] > nums[idx]
// for (int j = n - 1; j > idx; j--) {
// if (nums[j] > nums[idx]) {
// // Swap nums[j] and nums[idx]
// swap(nums, idx, j);
// break;
// }
// }

// // Step 4: Reverse the sub-array nums[idx + 1] to nums[n - 1]
// reverse(nums, idx + 1, n - 1);
// }

// private void swap(int[] nums, int i, int j) {
// int temp = nums[i];
// nums[i] = nums[j];
// nums[j] = temp;
// }

// private void reverse(int[] nums, int start, int end) {
// while (start < end) {
// swap(nums, start, end);
// start++;
// end--;
// }
// }

// public static void main(String[] args) {
// Solution sol = new Solution();
// int[] nums = {1, 2, 3};
// sol.nextPermutation(nums);
// System.out.println(Arrays.toString(nums)); // Output: [1, 3, 2]

// int[] nums2 = {3, 2, 1};
// sol.nextPermutation(nums2);
// System.out.println(Arrays.toString(nums2)); // Output: [1, 2, 3]

// int[] nums3 = {1, 1, 5};
// sol.nextPermutation(nums3);
// System.out.println(Arrays.toString(nums3)); // Output: [1, 5, 1]
// }
// }