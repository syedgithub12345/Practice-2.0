//longest subarray with sum k
import java.util.*;

public class longestsubarraysum {
    public static int longestSubarrayWithSumK(int[] a, long k) {
        Map<Long, Integer> prefixSumMap = new HashMap<>();
        long sum = 0;
        int maxLength = 0;

        // Traverse the array
        for (int i = 0; i < a.length; i++) {
            sum += a[i];

            // Check if the current prefix sum equals k
            if (sum == k) {
                maxLength = i + 1;
            }

            // Check if there is a prefix sum that we can subtract to get sum k
            if (prefixSumMap.containsKey(sum - k)) {
                maxLength = Math.max(maxLength, i - prefixSumMap.get(sum - k));
            }

            // Add the current prefix sum to the map if it is not already present
            if (!prefixSumMap.containsKey(sum)) {
                prefixSumMap.put(sum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        long k = 9;
        System.out.println(longestSubarrayWithSumK(a, k)); // Output: 3
    }
}

//or
// import java.util.*;

// public class main {
//     public static int longestSubarrayWithSumK(int[] a, long k) {
//         int n = a.length;
//         int len = 0;
//         int j;
//         for (int i = 0; i < n; i++) {
//             int sum = 0;
//             for (j = i; j < n; j++) {
//                 sum += a[j];

//                 if (sum == k) {
//                     len = Math.max(len, j - i + 1);
//                 }
//             }
//         }
//         return len;
//     }

//     public static void main(String[] args) {
//         int[] a = { 1, 2, 3, 4, 5, 5 };
//         long k = 10;
//         System.out.println(longestSubarrayWithSumK(a, k));
//     }
// }

// *********************************************** */
// //longest subarray with sum k
// //first code works
// import java.util.*;
// import java.io.*;

// public class main {
//     public static int getLongestSubarray(int[] nums, int k) {
//         Map<Long, Integer> prefixSumMap = new HashMap<Long, Integer>();
//         int n = nums.length;
//         long sum = 0;
//         int maxLength = 0;
//         for (int i = 0; i < n; i++) {
//             sum += nums[i];

//             if (sum == k) {
//                 maxLength = i + 1;
//             }

//             if (prefixSumMap.containsKey(sum - k)) {
//                 maxLength = Math.max(maxLength, i - prefixSumMap.get(sum - k));
//             }

//             if (!prefixSumMap.containsKey(sum)) {
//                 prefixSumMap.put(sum, i);
//             }
//         }
//         return maxLength;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int t = scanner.nextInt();
//         while (t-- > 0) {
//             int n = scanner.nextInt();
//             int k = scanner.nextInt();
//             int[] nums = new int[n];
//             for (int i = 0; i < n; i++) {
//                 nums[i] = scanner.nextInt();
//             }
//             System.out.println(getLongestSubarray(nums, k));
//         }
//         scanner.close();
//     }
// }

// import java.util.* ;
// import java.io.*;
// public class Solution {
// public static int getLongestSubarray(int []nums, int k) {
// Map<Long,Integer> prefixSumMap=new HashMap<Long,Integer>();
// int n=nums.length;
// long sum=0;
// int maxLength=0;
// for(int i=0;i<n;i++){
// sum+=nums[i];

// if(sum==k){
// maxLength=i+1;
// }
// if(prefixSumMap.containsKey(sum-k)){
// maxLength=Math.max(maxLength,prefixSumMap.get(sum-k));
// }
// if(!prefixSumMap.containsKey(sum)){
// prefixSumMap.put(sum,i);
// }
// }return maxLength;
// }
// }

// import java.util.* ;
// import java.io.*;
// public class Solution {
// public static int getLongestSubarray(int []nums, int k) {
// int len=0;
// int j;
// int n=nums.length;
// for(int i=0;i<n;i++){
// int sum=0;
// for(j=i;j<n;j++){
// sum+=nums[j];

// if(sum==k){
// len=Math.max(len,j-i+1);
// }
// }
// }return len;
// }
// }