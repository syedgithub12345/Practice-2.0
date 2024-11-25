import java.util.*;

class slidingpuzzle {
    public int slidingPuzzle(int[][] board) {
        String target = "123450";
        StringBuilder startBuilder = new StringBuilder();
        for (int[] row : board) {
            for (int num : row) {
                startBuilder.append(num);
            }
        }
        String start = startBuilder.toString();

        int[][] neighbors = {
            {1, 3},
            {0, 2, 4},
            {1, 5},
            {0, 4},
            {1, 3, 5},
            {2, 4}
        };

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.offer(start);
        visited.add(start);

        int moves = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String current = queue.poll();
                if (current.equals(target)) {
                    return moves;
                }
                int zeroIndex = current.indexOf('0');
                for (int neighbor : neighbors[zeroIndex]) {
                    String next = swap(current, zeroIndex, neighbor);
                    if (!visited.contains(next)) {
                        visited.add(next);
                        queue.offer(next);
                    }
                }
            }
            moves++;
        }

        return -1;
    }

    private String swap(String s, int i, int j) {
        char[] arr = s.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return new String(arr);
    }
}
