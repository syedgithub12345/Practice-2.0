//matrix spiral
import java.util.*;

public class spiralmatrix {
    public static int[] spiralMatrix(int[][] MATRIX) {
        int n = MATRIX.length;
        int m = MATRIX[0].length;
        int left = 0, right = m - 1;
        int top = 0, bottom = n - 1;
        int[] ans = new int[m * n];
        int index = 0;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                ans[index++] = MATRIX[top][i];
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                ans[index++] = MATRIX[i][right];
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans[index++] = MATRIX[bottom][i];
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans[index++] = MATRIX[i][left];
                }
                left++;
            }
        }
        return ans;
    }
}

// //or
// import java.util.*;

// public class spiralmatrix {
// public static int[] spiralMatrix(int[][] MATRIX) {
// int n = MATRIX.length;
// int m = MATRIX[0].length;
// int left = 0, right = m - 1;
// int top = 0, bottom = n - 1;
// ArrayList<Integer> ans = new ArrayList<>();

// while (top <= bottom && left <= right) {

// for (int i = left; i <= right; i++) {
// ans.add(MATRIX[top][i]);
// }
// top++;
// for (int i = top; i <= bottom; i++) {
// ans.add(MATRIX[i][right]);
// }
// right--;

// if (top <= bottom) {
// for (int i = right; i >= left; i--) {
// ans.add(MATRIX[bottom][i]);
// }
// bottom--;
// }

// if (left <= right) {
// for (int i = bottom; i >= top; i--) {
// ans.add(MATRIX[i][left]);
// }
// left++;
// }
// }

// // Convert ArrayList to int[]
// int[] result = new int[ans.size()];
// for (int i = 0; i < ans.size(); i++) {
// result[i] = ans.get(i);
// }
// return result;
// }

// public static void main(String[] args) {
// int[][] matrix = {
// {1, 2, 3, 4},
// {5, 6, 7, 8},
// {9, 10, 11, 12},
// {13, 14, 15, 16}
// };

// int[] result = spiralMatrix(matrix);
// System.out.println(Arrays.toString(result)); // Output: [1, 2, 3, 4, 8, 12,
// 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
// }
// }
