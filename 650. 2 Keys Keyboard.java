class Solution {
    public int minSteps(int n) {
        // If n is 1, no steps are needed
        if (n == 1) {
            return 0;
        }
        // If n is 2, the minimum steps are 2
        if (n == 2) {
            return 2;
        }
        int pre[] = new int[n + 1];  // Initialize an array to store minimum steps for each number
        pre[1] = 0;  // Base case: 0 steps needed for 1
        pre[2] = 2;  // Base case: 2 steps needed for 2
        
        // Loop through each number from 3 to n
        for (int i = 3; i <= n; i++) {
            pre[i] = i;  // Initialize steps to the maximum possible (i itself)
            int j = i / 2;  // Start checking divisors from i/2
            
            // Check for divisors of i
            while (j >= 1) {
                if (i % j == 0) {
                    // Update the minimum steps needed for i
                    pre[i] = Math.min(pre[i], pre[j] + i / j);
                }
                j--;  // Decrease j to check the next possible divisor
            }
        }
        return pre[n];  // Return the minimum steps needed for n
    }
}
