//Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
//rotate string

class rotatestring {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        return (s + s).contains(goal);
    }
}