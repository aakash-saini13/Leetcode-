// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n = nums.length; 
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = i + 1; j < n; j++) {  
//                 if (nums[i] + nums[j] == target) {
//                     return new int[] {i, j}; 
//                 }
//             }
//         }
//         return new int[] {}; 
//     }
// }
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a hashmap to store the difference and its index
        Map<Integer, Integer> numMap = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the difference needed to reach the target
            int difference = target - nums[i];
            
            // Check if the difference is already in the map
            if (numMap.containsKey(difference)) {
                // Return the indices of the two numbers
                return new int[] { numMap.get(difference), i };
            }
            
            // Otherwise, store the current number and its index in the map
            numMap.put(nums[i], i);
        }
        
        // Return an empty array if no solution is found
        return new int[] {};  // This line is theoretically unreachable given the problem's constraints
    }
}
