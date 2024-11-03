//processed string
// public class processstring {
//     public static String processString(String str) {
//         StringBuilder result = new StringBuilder();

//         char[] charArray = str.toCharArray();
//         for (char c : charArray) {
//             if (Character.isUpperCase(c)) {
//                 continue;
//             }
//             if (Character.isLowerCase(c)) {
//                 continue;
//             }
//             // if (Character.isDigit(c)) {
//             // continue;
//             // }
//             if (!Character.isLetterOrDigit(c)) {
//                 continue;
//             }
//             result.append(c);
//         }
//         return result.toString();
//     }

//     public static void main(String[] args) {
//         String str = "HEllo@123!";
//         String processedString = processString(str);
//         System.out.println("Answer :" + processedString);
//     }
// }

//or

public class prrocessstring {
    // Method to remove uppercase letters
    public static String removeUppercase(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (!Character.isUpperCase(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    // Method to remove lowercase letters
    public static String removeLowercase(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    // Method to remove special characters
    public static String removeSpecialCharacters(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    // Method to remove numeric characters
    public static String removeNumeric(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    // Method to remove non-numeric characters
    public static String removeNonNumeric(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Hello@123#World!";

        // Removing Uppercase Letters
        String withoutUppercase = removeUppercase(input);
        System.out.println("Without Uppercase: " + withoutUppercase);

        // Removing Lowercase Letters
        String withoutLowercase = removeLowercase(input);
        System.out.println("Without Lowercase: " + withoutLowercase);

        // Removing Special Characters
        String withoutSpecialCharacters = removeSpecialCharacters(input);
        System.out.println("Without Special Characters: " +
                withoutSpecialCharacters);

        // Removing Numeric Characters
        String withoutNumeric = removeNumeric(input);
        System.out.println("Without Numeric Characters: " + withoutNumeric);

        // Keeping Only Numeric Characters
        String onlyNumeric = removeNonNumeric(input);
        System.out.println("Only Numeric Characters: " + onlyNumeric);
    }
}
