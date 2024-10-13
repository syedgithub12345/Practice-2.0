//reverse words in string
import java.util.*;

public class reverse {
    public static String reversewords(String s) {
        String[] words = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "Hello World , ok ";
        System.out.println(reversewords(s));
    }
}

// ************************************************ */
// class main {
// public void reverseString(char[] s) {
// int left = 0;
// int right = s.length - 1;

// while (left < right) {
// char temp = s[left];
// s[left] = s[right];
// s[right] = temp;

// left++;
// right--;
// }
// }
// }