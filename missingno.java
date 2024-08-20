//missing number
import java.util.*;

public class missingno {
    public static int missingNumber(int[] a, int N) {
        int total = N * (N + 1) / 2;
        int sum = 0;

        for (int num : a) {
            sum += num;
        }
        return total - sum;
    }
}

// // or
// import java.util.*;

// public class missingno {
//     public static int missingNumber(int[] a, int N) {
//         // Initialize result as N (considering the range 1 to N)
//         int xor1 = 1;
//         for (int i = 2; i <= N; i++) {
//             xor1 ^= i;
//         }

//         // XOR all elements in the array
//         int xor2 = a[0];
//         for (int i = 1; i < N - 1; i++) {
//             xor2 ^= a[i];
//         }

//         // XOR of xor1 and xor2 gives the missing number
//         return xor1 ^ xor2;
//     }

//     public static void main(String[] args) {
//         // Test cases
//         int[] array1 = { 1, 2, 4, 6, 3, 7, 8 };
//         int N1 = 8;
//         System.out.println(missingNumber(array1, N1)); // Output: 5

//         int[] array2 = { 1, 2, 3, 5 };
//         int N2 = 5;
//         System.out.println(missingNumber(array2, N2)); // Output: 4
//     }
// }

// // or
// import java.util.*;

// public class missingno {
//     public static int missingNumber(int[] a, int N) {
//         Arrays.sort(a);
//         for (int i = 1; i < N; i++) {
//             if (a[i] > a[i - 1] && a[i] == 1 + a[i - 1]) {
//                 continue;
//             } else {
//                 return a[i - 1] + 1;
//             }
//         }
//         return N;
//     }
// }