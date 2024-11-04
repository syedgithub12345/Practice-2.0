//********************************************************* */
//Problem-8
import java.util.PriorityQueue;

class solution {
    private PriorityQueue<Integer> maxHeap;
    private PriorityQueue<Integer> minHeap;

    public solution() {
        maxHeap = new PriorityQueue<>((a, b) -> b - a);
        minHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());

        if (minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }
    
    public double findMedian() {
        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        }
        return (maxHeap.peek() + minHeap.peek()) / 2.0;
    }

    public static void main(String[] args) {
        solution solution = new solution();
        solution.addNum(1);  // arr = [1]
        System.out.println(solution.findMedian()); // Output: 1.0
        solution.addNum(2);  // arr = [1, 2]
        System.out.println(solution.findMedian()); // Output: 1.5
        solution.addNum(3);  // arr = [1, 2, 3]
        System.out.println(solution.findMedian()); // Output: 2.0
    }
}

//********************************************************* */
//Problem-13
import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int[] A = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        
        long initialSum = 0;
        for (int num : A) {
            initialSum += num;
        }
        
        int maxElement = 0;
        for (int num : A) {
            maxElement = Math.max(maxElement, num);
        }
        
        long maxSum = initialSum;
        for (int i = 0; i < N; i++) {
            int xorValue = A[i] ^ maxElement;
            long newSum = initialSum - A[i] + xorValue;
            maxSum = Math.max(maxSum, newSum);
        }
        System.out.println(maxSum);
        
        scanner.close();
    }
}
