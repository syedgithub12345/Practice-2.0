//intersection of two sorted arrays

import java.util.*;
import java.io.*;

public class intersection {
    public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2,
            int m) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (arr1.get(i).equals(arr2.get(j))) {
                ans.add(arr1.get(i));
                i++;
                j++;
            } else if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(2, 2, 3, 3, 5));

        ArrayList<Integer> intersection = findArrayIntersection(arr1, arr1.size(),
                arr2, arr2.size());

        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }
}