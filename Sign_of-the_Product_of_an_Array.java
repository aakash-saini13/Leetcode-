class Solution {
    public int arraySign(int[] nums) {
        // Initialize a counter to track the number of negative numbers
        int count = 0;
        // Iterate through the array
        for (int num : nums) {
            // If the current number is negative, increment the counter
            if (num < 0) {
                count++;
            }
            // If the current number is zero, return 0 immediately
            if (num == 0) {
                return 0;
            }
        }
        // If the counter is even, return 1 (indicating a positive product)
        if (count % 2 == 0) {
            return 1;
        }
        // If the counter is odd, return -1 (indicating a negative product)
        else {
            return -1;
        }
    }
}

/*Time Complexity: O(n), where n is the length of the input array nums. This is because we iterate through the array once.

Space Complexity: O(1), which means the space complexity is constant. This is because we only use a single variable count to track
the number of negative numbers, which does not depend on the size of the input array.*/
