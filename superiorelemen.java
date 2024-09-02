// superior element (array in correct order)

import java.util.*;
//import com.sun.swing.internal.plaf.metal.resources.metal;

public class superiorelemen {
    public static List<Integer> superiorElements(int[] a) {
        List<Integer> result = new ArrayList<>();
        int n = a.length;
        int lar = a[n - 1];
        result.add(lar);
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] > lar) {
                result.add(a[i]);
                lar = a[i];
            }
        }
        Collections.sort(result);
        return result;
    }
}