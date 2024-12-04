class makesubsequence {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i = 0, j = 0;
        while (i < str1.length() && j < str2.length()) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(j);

            if (c1 == c2 || (c1 - 'a' + 1) % 26 + 'a' == c2) {
                j++; 
            }

            i++; 
        }

        return j == str2.length();
    }
}
