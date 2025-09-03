
        public class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = -1;
            }
        }

        int i = 0, j = 0;
        int diri = 0, dirj = 1;

        while (head != null) {
            matrix[i][j] = head.val;
            head = head.next;

            int nexti = i + diri;
            int nextj = j + dirj;
            if (insideMatrixAndNotUsed(matrix, nexti, nextj)) {
                i = nexti;
                j = nextj;
            } else {
                int temp = diri;
                diri = dirj;
                dirj = -temp;
                i += diri;
                j += dirj;
                if (!insideMatrixAndNotUsed(matrix, i, j)) {
                    break;
                }
            }
        }

        return matrix;
    }

    private boolean insideMatrixAndNotUsed(int[][] matrix, int i, int j) {
        return (0 <= i && i < matrix.length) && (0 <= j && j < matrix[0].length) && (matrix[i][j] == -1);
    }
}
