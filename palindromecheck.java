//*********************************************** */

//palindrome number check
public class palindromecheck {
    public static boolean palindromeNumber(int n) {
        int original = n;
        int revnum = 0;
        while (n > 0) {
            int rem = n % 10;
            revnum = revnum * 10 + rem;
            n = n / 10;
        }
        return revnum == original;
    }

    public static void main(String[] args) {
        int number = 121;
        System.out.println(palindromeNumber(number));
    }
}

// //palindrome number check
// public class palindromecheck {
// public static boolean palindromeNumber(int n) {
// int original = n;
// int revnum = 0;
// while (n > 0) {
// int rem = n % 10;
// revnum = revnum * 10 + rem;
// n = n / 10;
// }
// return revnum == original;
// }

// public static void main(String[] args) {
// int number = 121;
// for(int i=20;i<=100;i++){
// if(palindromeNumber(i)){
// System.out.print(i+ " ");
// };
// }}
// }
