//subarray max sum
public class subarraymax {
    public static int maxsum(int[] arr) {
        int n = arr.length;
        int maxsum = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum > maxsum) {
                    maxsum = sum;
                }
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 5, 7, 6, -32, -412 };
        System.out.println(maxsum(arr));
    }
}

// or
// kadane algorithm
// public class main {
// public static long maxSubarraySum(int[] arr, int n) {
// long maxsum=0;
// long sum=0;
// for(int i=0;i<n;i++){
// sum+=arr[i];
// if(sum<0){
// sum=0;
// }
// if(sum>maxsum){
// maxsum=sum;
// }
// }return maxsuml;
// }
// }