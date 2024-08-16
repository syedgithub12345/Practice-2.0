//*********************************************************** */
//rotate array by k
import java.util.ArrayList;

public class rotatebyk {
    public static int[] convertToIntArray(ArrayList<Integer> arr) {
        int[] intarr = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            intarr[i] = arr.get(i);
        }
        return intarr;
    }

    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        int[] intarr = convertToIntArray(arr);
        k = k % n;
        if (k == 0) {
            return arr;
        }

        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = intarr[i];
        }
        for (int i = 0; i < n - k; i++) {
            intarr[i] = intarr[i + k];
        }
        int i = 0;
        for (int j = n - k; j < n; j++) {
            intarr[j] = temp[i];
            i++;
        }
        ArrayList<Integer> rotatedArr = new ArrayList<>();
        for (int num : intarr) {
            rotatedArr.add(num);
        }
        return rotatedArr;
    }
}