import java.util.*;

public class minelem {
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

// import java.util.*;
// public class Solution{
// public static int minelement(int[] nums){
// int min=Integer.MAX_VALUE;
// HashSet<Integer> set=new HashSet<>();
// for(int num:nums){
// set.add(num);
// }
// for(int num:nums){
// min=Math.min(num,min);
// }
// return min;
// }
// public static void main(String args[]){
// int[] nums={3,4,56,9};
// int ans=minelement(nums);
// System.out.println(ans);
// }
// }

// // max element
// import java.util.*;
// public class Solution{
// public static int maxelement(int[] nums){
// int min=Integer.MIN_VALUE;
// HashSet<Integer> set=new HashSet<>();
// for(int num:nums){
// set.add(num);
// }
// for(int num:nums){
// min=Math.max(num,min);
// }
// return min;
// }
// public static void main(String args[]){
// int[] nums={3,4,56,9};
// int ans=maxelement(nums);
// System.out.println(ans);
// }
// }