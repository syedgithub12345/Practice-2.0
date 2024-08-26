// element appear n/2 times
// Boyer-Moore Voting Algorithm
import java.util.*;

public class elements {
public static int majorityElement(int[] nums) {
int candidate = nums[0];
int count = 1;

for (int i = 1; i < nums.length; i++) {
if (count == 0) {
candidate = nums[i];
count = 1;
} else if (nums[i] == candidate) {
count++;
} else {
count--;
}
}

return candidate;
}

public static void main(String[] args) {
int[] v = { 3, 3, 3, 4, 5, 54, 54, 54, 3, 3, 3, 3, };
System.out.println(majorityElement(v));
}
}