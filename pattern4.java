//***************************************/
import java.util.Scanner;

class pattern4 {
    public static void printpattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
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
// 2 2
// 3 3 3
// 4 4 4 4