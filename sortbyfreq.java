
//sort by frequency
import java.util.*;

public class sortbyfreq {
    public static void sortByFrequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        Collections.sort(list, (a, b) -> {
            int freq1 = map.get(a);
            int freq2 = map.get(b);
            if (freq1 != freq2) {
                return freq2 - freq1;
            } else {
                return a - b;
            }
        });

        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 2, 4, 3, 1, 2 };
        sortByFrequency(array);
    }
}