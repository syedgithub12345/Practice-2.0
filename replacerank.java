//replace number by rank
import java.util.*;

public class replacerank {
    public static int[] replacerank(int[] arr) {
        int n = arr.length;
        int[] copy = new int[n];
        for (int i = 0; i < n; i++) {
            copy[i] = arr[i];
        }
        Arrays.sort(copy);
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : copy) {
            if (!map.containsKey(num)) {
                map.put(num, map.size() + 1);
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, -2, 1 };
        int[] ans = replacerank(arr);
        System.out.println(Arrays.toString(ans));
    }
}