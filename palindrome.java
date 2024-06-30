//************************************************** */
//palindrome using recursion
public class palindrome {
    public static boolean check(String s, int i) {
        if (i >= s.length() / 2) {
            return true;
        }
        if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(s.length() - i - 1))) {
            return false;
        }
        return check(s, i + 1);
    }

    public static void main(String[] args) {
        String s = "MadaM";
        System.out.println(check(s, 0));
    }
}