// unique elements
import java.util.*;

public class uniqueelem {
    public static int unique(int[] arr) {
        int n = arr.length;
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 1, 1, 2 };
        System.out.println(unique(arr));
    }
}

// //aproach 2
// import java.util.*;
// public class main{
// public static int unique(int[] arr){
// int n=arr.length;
// Set<Integer> set=new HashSet<>();
// for(int i=0;i<n;i++){
// set.add(arr[i]);
// }
// return set.size();
// }
// public static void main(String[] args) {
// int[] arr={2,3,4,5,1,1,2};
// System.out.println(unique(arr));
// }
// }