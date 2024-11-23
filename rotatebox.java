class rotatebox {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length, n = box[0].length;
        char[][] rotatedBox = new char[n][m];

        for (int i = 0; i < m; i++) {
            int emptySpot = n - 1;
            for (int j = n - 1; j >= 0; j--) {
                if (box[i][j] == '*') {
                    emptySpot = j - 1;
                } else if (box[i][j] == '#') {
                    box[i][j] = '.';
                    box[i][emptySpot] = '#';
                    emptySpot--;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rotatedBox[j][m - i - 1] = box[i][j];
            }
        }

        return rotatedBox;
    }
}
