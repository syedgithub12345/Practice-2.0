
//max count ones
import java.util.*;
import java.io.*;

public class maxcount {
    public static int consecutiveOnes(int n, int[] arr) {
        int maxcount = 0;
        int currentcount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                currentcount++;
                maxcount = Math.max(currentcount, maxcount);
            } else {
                currentcount = 0;
            }
        }
        return maxcount;
    }
}
