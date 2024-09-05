//rotate the matrix by 90 degree
import java.util.*;

public class rotate90matrix {
    public static void rotateMatrix(int[][] mat) {
        int n = mat.length;
        int[][] ans = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[j][n - i - 1] = mat[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = ans[i][j];
            }
        }
    }
}

// //or
// import java.util.*;
// public class rotate90matrix{
// public static void rotateMatrix(int[][] mat){
// int n=mat.length;
// for(int i=0;i<n;i++){
// for(int j=i;j<n;j++){
// int temp=mat[i][j];
// mat[i][j]=mat[j][i];
// mat[j][i]=temp;
// }
// }
// for(int i=0;i<n;i++){
// for(int j=0;j<n/2;j++){
// int temp=mat[i][j];
// mat[i][j]=mat[i][n-j-1];
// mat[i][n-j-1]=temp;
// }
// }
// }
// }