//************************************* */
import java.util.Scanner;

public class pattern2 {
    public static void printpattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
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
// *
// * *
// * * *
// * * * *
// * * * * */