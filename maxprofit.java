
// ******************************************* */
// max profit
import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class maxprofit {
    public static int maximumProfit(ArrayList<Integer> prices) {
        int n = prices.size();
        int[] arr = new int[n];
        if (prices.size() == 0) {
            return 0;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = prices.get(i);
        }
        Arrays.sort(arr);
        return arr[n - 1] - arr[0];
    }
}

// or
// import java.util.ArrayList;

// public class Solution {
// public static int maximumProfit(ArrayList<Integer> prices) {
// int n = prices.size();
// if (prices == null || n == 0) {
// return 0;
// }

// int minPrice = Integer.MAX_VALUE;
// int maxProfit = 0;

// for (int i = 0; i < n; i++) {
// int currPrice = prices.get(i);

// if (currPrice < minPrice) {
// minPrice = currPrice;
// }
// int profit = currPrice - minPrice;

// if (profit > maxProfit) {
// maxProfit = profit;
// }
// }
// return maxProfit;
// }
// }