//hashmap for check equal pair formed
import java.util.*;

public class hashmap {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            for (int freq : map.values()) {
                if (freq % 2 != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        hashmap main = new hashmap();
        int[] nums = { 3, 4, 2, 1, 43, 5, 9 };
        System.out.println(main.divideArray(nums));
    }
}