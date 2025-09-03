class Solution {
    public boolean isMonotonic(int[] nums) {
        // Check if the array is increasing or decreasing based on the first and last elements
        if (nums[0] < nums[nums.length - 1]) {
            // If the array is supposed to be increasing
            for (int i = 1; i < nums.length; i++) {
                // Check if the previous element is greater than the current element
                if (nums[i - 1] > nums[i]) {
                    // If so, the array is not monotonic
                    return false;
                }
            }
        } else {
            // If the array is supposed to be decreasing
            for (int i = 1; i < nums.length; i++) {
                // Check if the previous element is less than the current element
                if (nums[i - 1] < nums[i]) {
                    // If so, the array is not monotonic
                    return false;
                }
            }
        }
        // If the loop completes without finding any violations, the array is monotonic
        return true;
    }
}
