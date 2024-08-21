class Solution {
  
    public int countOdds(int low, int high) {
        // Calculate the number of pairs of numbers between low and high.
        // Since each pair contains one odd and one even number, the number of odd numbers is half of the total count.
        int count = (high - low) / 2;
        
        // Check if either low or high is odd.
        // If either of them is odd, it means there's an extra odd number that's not part of a pair, so we increment the count by 1.
        if (low % 2 != 0 || high % 2 != 0) {
            count++;
        }
        
        // Return the total count of odd numbers.
        return count;
    }
}
