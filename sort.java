//sorting
//selection sort- n^2 time complexity
import java.util.*;

public class sort {
public static void selection_sort(int n, int[] arr) {
for (int i = 0; i < n - 1; i++) {
int mini = i;
for (int j = i; j < n; j++) {
if (arr[j] < arr[mini]) {
mini = j;
}
}
int temp = arr[mini];
arr[mini] = arr[i];
arr[i] = temp;
}
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt();
}
selection_sort(n, arr);
for (int i = 0; i < n; i++) {
System.out.println(arr[i]);
}
}
}