class Solution {
    public int nthUglyNumber(int n) {
        // Create an array to store the first 'n' ugly numbers
        int[] t = new int[n + 1];
        // The first ugly number is 1
        t[1] = 1;
        // Initialize pointers for multiples of 2, 3, and 5
        int i2 = 1;
        int i3 = 1;
        int i5 = 1; 
        // Loop to calculate the nth ugly number
        for (int i = 2; i <= n; i++) {
            // Calculate the next potential ugly numbers by multiplying
            // the ugly numbers pointed by i2, i3, and i5 by 2, 3, and 5 respectively
            int i2th_ugly = t[i2] * 2;
            int i3rd_ugly = t[i3] * 3;
            int i5th_ugly = t[i5] * 5;
            // The next ugly number is the minimum of the above three values
            t[i] = Math.min(Math.min(i2th_ugly, i3rd_ugly), i5th_ugly);
            // Move the pointer(s) that match the minimum value forward
            if (t[i] == i2th_ugly) {
                i2++;
            }
            if (t[i] == i3rd_ugly) {
                i3++;
            }
            if (t[i] == i5th_ugly) {
                i5++;
            }
        }
        // Return the nth ugly number
        return t[n];
    }
}
