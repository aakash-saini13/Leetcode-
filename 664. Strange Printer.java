class Solution {
    int n;
    int[][] dp;

    int solve(int l, int r, String s) {
        if (l == r) return 1;

        if (l > r) return 0;

        if (dp[l][r] != -1) return dp[l][r];

        int i = l + 1;
        while (i <= r && s.charAt(i) == s.charAt(l)) i++;

        if (i == r + 1) return 1;

        int normal = 1 + solve(i, r, s);
        int minOperations = Integer.MAX_VALUE;

        for (int j = i; j <= r; j++) {
            if (s.charAt(l) == s.charAt(j)) {
                int x = solve(i, j - 1, s) + solve(j, r, s);
                minOperations = Math.min(minOperations, x);
            }
        }

        return dp[l][r] = Math.min(normal, minOperations);
    }

    public int strangePrinter(String s) {
        n = s.length();
        dp = new int[n][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(0, n - 1, s);
    }
}
