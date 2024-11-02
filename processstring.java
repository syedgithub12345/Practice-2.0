//processed string
public class processstring {
    public static String processString(String str) {
        StringBuilder result = new StringBuilder();

        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (Character.isUpperCase(c)) {
                continue;
            }
            if (Character.isLowerCase(c)) {
                continue;
            }
            // if (Character.isDigit(c)) {
            // continue;
            // }
            if (!Character.isLetterOrDigit(c)) {
                continue;
            }
            result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "HEllo@123!";
        String processedString = processString(str);
        System.out.println("Answer :" + processedString);
    }
}

// //or

// public class removeuppercase {
// // Method to remove uppercase letters
// public static String removeUppercase(String input) {
// StringBuilder result = new StringBuilder();
// for (char c : input.toCharArray()) {
// if (!Character.isUpperCase(c)) {
// result.append(c);
// }
// }
// return result.toString();
// }
