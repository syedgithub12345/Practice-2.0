import java.util.*;
class flipcolumn {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        Map<String, Integer> patternCount = new HashMap<>();
        for (int[] row : matrix) {
            StringBuilder pattern = new StringBuilder();
            for (int cell : row) {
                pattern.append(cell ^ row[0]);
            }
            String key = pattern.toString();
            patternCount.put(key, patternCount.getOrDefault(key, 0) + 1);
        }
        int maxRows = 0;
        for (int count : patternCount.values()) {
            maxRows = Math.max(maxRows, count);
        }
        return maxRows;
    }
}
