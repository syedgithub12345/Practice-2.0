import java.util.Scanner;

class pattern5 {
    public static void printpattern(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*" + " ");
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
// * * * *
// * * *
// * *
// *

// //************************************** */
// //or

// import java.util.Scanner;

// class pattern5 {
// public static void printpattern(int n) {
// for (int i = 1; i<=n; i++) {
// for (int j = 0; j <n-i+1; j++) {
// System.out.print("*"+" ");
// }
// System.out.println();
// }
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// printpattern(n);
// }
// }
// // * * * *
// // * * *
// // * *
// // *