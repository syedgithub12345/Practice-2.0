
//negative and positive on alternate position
import java.util.*;

public class negposalter {
    public static int[] alternateNumbers(int[] a) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int num : a) {
            if (num >= 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }
        int i = 0, p = 0, n = 0;
        while (p < pos.size() && n < neg.size()) {
            a[i++] = pos.get(p++);
            a[i++] = neg.get(n++);
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, -3, -1, -2, 3 };
        System.out.println(Arrays.toString(alternateNumbers(arr1))); // Output: [1,-3, 2, -1, 3, -2]

        int[] arr2 = { -2, -3, 4, 5 };
        System.out.println(Arrays.toString(alternateNumbers(arr2))); // Output: [4,-2, 5, -3]
    }
}
