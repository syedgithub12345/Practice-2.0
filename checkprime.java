//check prime factors or not
import java.util.Scanner;

public class checkprime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Prime factors of " + num + " are: ");
        findPrimeFactors(num);
        scanner.close();
    }

    public static void findPrimeFactors(int num) {
        int i = 1;
        while (i <= num) {
            int k = 0;
            if (num % i == 0) { // Finding factor
                int j = 1;
                while (j <= i) { // Check prime or not
                    if (i % j == 0) {
                        k++;
                    }
                    j++;
                }
                if (k == 2) {
                    System.out.print(i + " is a prime factor\n");
                }
            }
            i++;
        }
    }
}
