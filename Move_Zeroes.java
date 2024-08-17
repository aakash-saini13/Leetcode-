class Solution {
  public void moveZeroes(int[] nums) {
        // Get the length of the input array.
        int length = nums.length;

        // Initialize a counter to keep track of the position of the next non-zero element.
        int count = 0;

        // Iterate over the array to move all non-zero elements to the front.
        for (int i = 0; i < length; i++) {
            // Check if the current element is not zero.
            if (nums[i] != 0) {
                // If it's not zero, move it to the next available position (pointed by count).
                nums[count++] = nums[i];
            }
        }

        // Fill the remaining positions with zeroes.
        while (count < length) {
            // Assign zero to the current position and increment the counter.
            nums[count++] = 0;
        }
    }
}
