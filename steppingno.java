// stepping numbers
public class steppingno {
    public ArrayList<Integer> stepnum(int A, int B) {
        ArrayList<Integer> ret = new ArrayList<>();

        for (int num = 1; num <= 9; num++) {
            dfs(A, B, num, ret);
        }
        Collections.sort(ret);
        return ret;
    }

    private void dfs(int A, int B, int num, ArrayList<Integer> ret) {
        if (num > B)
            return;
        if (num >= A & num <= B) {
            return ret.add(num);
        }
        int m = num % 10;

        if (m != 0) {
            int prev = num * 10 + (m - 1);
            dfs(A, B, prev, ret);
        }
        if (m != 9) {
            int next = num * 10 + (m + 1);
            dfs(A, B, next, ret);
        }
    }
}