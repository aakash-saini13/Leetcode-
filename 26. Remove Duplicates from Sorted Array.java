class Solution {
    public int removeDuplicates(int[] nums) {
        // If the array is empty, return 0
        if (nums.length == 0) return 0;
        
        int i = 0; // Initialize the first pointer i to track unique elements
        
        // Loop through the array starting from the second element
        for (int j = 1; j < nums.length; j++) {
            // If the current element is different from the element at pointer i
            if (nums[j] != nums[i]) {
                i++; // Increment i to the next position for a unique element
                nums[i] = nums[j]; // Update the element at i with the current element
            }
        }
        
        // Return the length of the array with unique elements
        return i + 1;
    }
}
