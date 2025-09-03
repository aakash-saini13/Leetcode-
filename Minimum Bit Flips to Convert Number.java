class Solution {
    public int minBitFlips(int start, int goal) {
        int count=0;
        int bitFlip=start^goal;
        while(bitFlip>0){
            if((bitFlip & 1)==1){
                count++;
            }
            bitFlip = bitFlip>>1;
        }
        return count;
    }
}
