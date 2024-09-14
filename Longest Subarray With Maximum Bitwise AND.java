class Solution {
    public int longestSubarray(int[] nums) {
        int maxo = 0, ans = 0, count = 0;
        for (int x : nums) {
            maxo = Math.max(maxo, x);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == maxo) {
                count++;
            } else {
                count = 0;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }
}
