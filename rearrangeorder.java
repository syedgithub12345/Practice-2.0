//Rearrange array in increasing-decreasing order
class rearrangeorder {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 52, 3, 32, 1, 3 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("*******************");
        int k = 3;
        for (int i = k; i < k + (n - k) / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - (i - k) - 1];
            arr[n - (i - k) - 1] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
