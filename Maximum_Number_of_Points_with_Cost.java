public class Solution {
    public long maxPoints(int[][] points) {
        int m = points.length;
        int n = points[0].length;
        // Initialize the array for the previous row
        long[] prev = new long[n];
        for (int j = 0; j < n; j++) {
            prev[j] = points[0][j];
        }
        // Process each row
        for (int i = 1; i < m; i++) {
            long[] curr = new long[n];
            // Track the maximum values while scanning left-to-right
            long maxLeft = prev[0];
            for (int j = 0; j < n; j++) {
                maxLeft = Math.max(maxLeft - 1, prev[j]);
                curr[j] = points[i][j] + maxLeft;
            }  
            // Track the maximum values while scanning right-to-left
            long maxRight = prev[n - 1];
            for (int j = n - 1; j >= 0; j--) {
                maxRight = Math.max(maxRight - 1, prev[j]);
                curr[j] = Math.max(curr[j], points[i][j] + maxRight);
            }   
            // Move to the next row
            prev = curr;
        }
        // Find the maximum score in the last row
        long maxPoints = Long.MIN_VALUE;
        for (int j = 0; j < n; j++) {
            maxPoints = Math.max(maxPoints, prev[j]);
        }
        return maxPoints;
    }
}
