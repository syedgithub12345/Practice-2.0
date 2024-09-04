// ******************************************************* */
//set matrix zeroes
import java.util.*;
import java.io.*;

public class setmatrixzero {
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (row[i]) {
                for (int j = 0; j < m; j++) {
                    matrix.get(i).set(j, 0);
                }
            }
        }
        for (int j = 0; j < m; j++) {
            if (col[j]) {
                for (int i = 0; i < n; i++) {
                    matrix.get(i).set(j, 0);
                }
            }
        }
        return matrix;
    }
}

// //or using array
// import java.util.*;
// class Solution {
// public void setZeroes(int[][] matrix) {
// int n=matrix.length;
// int m=matrix[0].length;
// boolean[] row=new boolean[n];
// boolean[] col=new boolean[m];
// for(int i=0;i<n;i++){
// for(int j=0;j<m;j++){
// if(matrix[i][j]==0){
// row[i]=true;
// col[j]=true;
// }
// }
// }
// for(int i=0;i<n;i++){
// if(row[i]){
// for(int j=0;j<m;j++){
// matrix[i][j]=0;
// }}
// }
// for(int j=0;j<m;j++){
// if(col[j]){
// for(int i=0;i<n;i++){
// matrix[i][j]=0;
// }
// }
// }
// }
// }