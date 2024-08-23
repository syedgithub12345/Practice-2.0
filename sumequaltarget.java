//sum equal to target
import java.util.HashSet;
import java.util.Set;

public class sumequaltarget {
    public static String read(int n, int[] book, int target) {
        Set<Integer> seen = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int diff = target - book[i];
            if (seen.contains(diff)) {
                return "YES";
            }
            seen.add(book[i]);
        }
        return "NO";
    }

    public static void main(String[] args) {
        int n = 5;
        int[] book = { 1, 2, 3, 4, 5 };
        int target = 6;
        System.out.println(read(n, book, target)); // Output: YES
    }
}