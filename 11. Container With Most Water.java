class Solution {
    public int maxArea(int[] height) {
        int i = 0; // Initialize left pointer
        int j = height.length - 1; // Initialize right pointer
        int mxWater = 0; // Variable to store the maximum area found

        while(i < j) { // Continue until the two pointers meet
            int w = j - i; // Calculate the width between the two pointers
            int h = Math.min(height[i], height[j]); // Determine the shorter height
            int area = h * w; // Calculate the area with the current width and height
            mxWater = Math.max(mxWater, area); // Update maximum area if the current area is larger
            
            // Move the pointer corresponding to the shorter height
            if(height[i] > height[j]) {
                j--; // Move the right pointer leftwards
            } else {
                i++; // Move the left pointer rightwards
            }
        }
        
        return mxWater; // Return the maximum area found
    }
}
