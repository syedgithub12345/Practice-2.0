//Sort an array according to the order defined by another array
import java.util.*;

public class relativeorder {
    public static void relativeOrder(List<Integer> arr, List<Integer> arr2) {
        int m = arr.size();
        int n = arr2.size();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            map.put(arr.get(i), map.getOrDefault(arr.get(i), 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr2.get(i))) {
                int count = map.get(arr2.get(i));
                while (count > 0) {
                    result.add(arr2.get(i));
                    count--;
                }
                map.remove(arr2.get(i));
            }
        }
        List<Integer> remaining = new ArrayList<>();
        for (int key : map.keySet()) {
            int count = map.get(key);
            while (count > 0) {
                remaining.add(key);
                count--;
            }
        }
        Collections.sort(remaining);
        result.addAll(remaining);
        System.out.println(result);
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 3);
        List<Integer> arr2 = Arrays.asList(2, 1, 8, 3);

        relativeOrder(arr, arr2);
    }
}
