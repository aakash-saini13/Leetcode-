class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        // Initialize MIN and MAX using the first array
        int MIN = arrays.get(0).get(0); // First element of the first array
        int MAX = arrays.get(0).get(arrays.get(0).size() - 1); // Last element of the first array
        
        int ans = 0; // To store the maximum distance

        // Iterate through each subsequent array
        for (int i = 1; i < arrays.size(); i++) { // Start from 1 since MIN and MAX are initialized from the first array
            List<Integer> currentArray = arrays.get(i); // Get the current array
            int currentMin = currentArray.get(0); // First element of the current array
            int currentMax = currentArray.get(currentArray.size() - 1); // Last element of the current array

            // Calculate the maximum distance considering pairs from the current array with previously tracked MIN and MAX
            ans = Math.max(ans, Math.max(Math.abs(currentMin - MAX), Math.abs(currentMax - MIN)));
            
            // Update MIN and MAX for future comparisons
            MAX = Math.max(MAX, currentMax); // Update MAX to the maximum value seen so far
            MIN = Math.min(MIN, currentMin); // Update MIN to the smallest minimum value seen so far
        }

        // Return the maximum distance found
        return ans;
    }
}
