
//armstrong range
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers (intervals): ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        System.out.println("Armstrong numbers between " + n1 + " and " + n2 + " are:");
        for (int i = n1 + 1; i < n2; ++i) {
            int temp = i;
            int num = 0;
            int rem;
            while (temp != 0) {
                rem = temp % 10;
                num += rem * rem * rem;
                temp /= 10;
            }
            if (i == num) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}