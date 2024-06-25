//************************************* */
import java.util.Scanner;

class pattern3 {
    public static void printpattern(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printpattern(n);
    }
}
// 1
// 1 2