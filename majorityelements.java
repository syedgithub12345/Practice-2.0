//majority elements n/2
public class majorityelements {
    public static int majorityElement(int[] arr) {
        int n = arr.length;
        int j;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (j = 0; j < n - 1; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > n / 2)
                return arr[j];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 335, 2, 5, 5, 5, 5, 5 };
        System.out.println(majorityElement(arr));
    }
}

// or
// //using hashmap
// import java.util.HashMap;

// public class main {
// public static int majorityElement(int[] arr) {
// HashMap<Integer, Integer> map = new HashMap<>();
// int n = arr.length;
// for (int num : arr) {
// map.put(num, map.getOrDefault(num, 0) + 1);
// }
// for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
// if (entry.getValue() > n / 2) {
// return entry.getKey();
// }
// }
// return -1;
// }

// public static void main(String[] args) {
// int[] arr = { 2, 3, 3, 3, 3, 3, 34, 5, 3, 7 };
// System.out.println(majorityElement(arr));
// }
// }