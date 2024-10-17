//upper case conversion and vice versa
import java.util.*;

public class uppertolowercase {
    public static StringBuffer convertletter(StringBuffer s) {
        for (int i = 0; i < s.length(); i++) {
            Character chr = s.charAt(i);
            if (Character.isLowerCase(chr)) {
                s.setCharAt(i, Character.toUpperCase(chr));
            } else {
                s.setCharAt(i, Character.toLowerCase(chr));
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        StringBuffer sb = new StringBuffer(s);
        System.out.println(convertletter(sb));

    }
}