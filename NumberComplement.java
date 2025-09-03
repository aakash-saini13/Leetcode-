class Solution {
    public int findComplement(int num) {
        int mask = (Integer.highestOneBit(num) << 1) - 1;
        
        // Return the complement by XORing with the mask
        return num ^ mask;
    }
}
