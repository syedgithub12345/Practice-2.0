
//longest substring without repeating
import java.util.*;
public class longsubstring {
    public int longestsubstring(String s) {
        int max = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i; j < n; j++) {
                if (set.contains(s.charAt(j))) {
                    break;
                }
                set.add(s.charAt(j));
                max = Math.max(max, j - i + 1);
            }
        }
        return max;
    }
}
