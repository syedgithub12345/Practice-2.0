//string matching in array
class stringmatch {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        for (final String i : words) {
            for (final String j : words) {
                if (i.length() < j.length() && j.indexOf(i) != -1) {
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}
