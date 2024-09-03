//*************************************** */
//longest successive elements
import java.util.HashSet;
import java.util.Set;

public class longestsuccelement {
    public static int longestSuccessiveElements(int[] a) {
        if (a == null || a.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        for (int num : a) {
            set.add(num);
        }

        int longestStreak = 0;

        for (int num : a) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        int[] arr1 = { 100, 4, 200, 1, 3, 2 };
        System.out.println(longestSuccessiveElements(arr1)); // Output: 4 (sequence is 1, 2, 3, 4)

        int[] arr2 = { 1, 2, 3, 4, 5, 6 };
        System.out.println(longestSuccessiveElements(arr2)); // Output: 6 (sequence is 1, 2, 3, 4, 5, 6)

        int[] arr3 = { 1, 9, 3, 10, 4, 20, 2 };
        System.out.println(longestSuccessiveElements(arr3)); // Output: 4 (sequence is 1, 2, 3, 4)
    }
}