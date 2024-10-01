
//repeating elements in an array
import java.util.*;

public class repeatelem {
    public static boolean repeat(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 1, 3, 4, 2, 23, };
        System.out.println(repeat(arr));
    }
}

// ********************************** */
// //repeating numbers
// import java.util.*;
// public class main{
// public static void repeat(int[] nums){
// int n=nums.length;
// int count=0;
// int[] ans=new int[n];
// for(int i=0;i<n-1;i++){
// for(int j=i+1;j<n;j++){
// if(nums[i]==nums[j]) ans[count++]=nums[i];
// }
// }System.out.println("repeating elements :");
// for(int i=0;i<count;i++){
// if(ans[i]!=ans[i+1]) System.out.println(ans[i]+" ");
// }
// }
// public static void main(String[] args) {
// int[] nums={9,9,4,2,3};
// repeat(nums);
// }
// }

// ************************************* */
// //or
// //repeating numbers
// import java.util.*;

// public class main {
// public static void repeat(int[] nums) {
// int n = nums.length;
// HashMap<Integer, Integer> map = new HashMap<>();

// for (int i = 0; i < n; i++) {
// map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
// }
// for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
// if (entry.getValue() > 1) {
// System.out.println(entry.getKey());
// }
// }
// }

// public static void main(String[] args) {
// int[] nums = {9, 9, 4, 2, 3};
// repeat(nums);
// }
// }