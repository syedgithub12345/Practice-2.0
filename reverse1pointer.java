//reverse array using recursion 1-pointer
public class reverse1pointer {
    public static void reverse(int[] arr, int i) {
        if (i >= arr.length / 2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;
        reverse(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 7 };
        reverse(arr, 0);

        for (int i : arr) {
            System.out.println(i);
        }
    }
}