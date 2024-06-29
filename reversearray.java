//reverse array using recursion 2-pointers
public class reversearray {
    public static void reverse(int[] arr, int l, int r) {
        if (l > r) {
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverse(arr, l + 1, r - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 7 };
        reverse(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.println(i);
        }
    }
}