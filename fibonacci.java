//******************************************** */
//fibonacci using recursion
public class fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int terms = 10;
        System.out.println("Fibonacci series up to " + terms + " terms:");

        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}