
//minimum path find
import java.util.ArrayList;

public class minpathfind {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int sx = A.get(0);
        int sy = B.get(0);
        for (int i = 1; i < A.size(); i++) {
            int cx = A.get(i);
            int cy = B.get(i);

            ans += Math.max(Math.abs(cx - sx), Math.abs(cy - cx));

            sx = cx;
            sy = cy;
        }
        return ans;
    }
}