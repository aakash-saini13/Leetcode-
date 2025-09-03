class Solution {
    public int[] plusOne(int[] digits) {
        // Iterate through the digits from right to left
        for (int i = digits.length - 1; i >= 0; i--) {
            // If the current digit is less than 9, increment it and return the array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If the current digit is 9, set it to 0 and continue to the next digit
            digits[i] = 0;
        }
        // If all digits are 9, create a new array with an extra digit and set the first digit to 1
        int[] arr = new int[digits.length + 1];
        arr[0] = 1;
        return arr;
    }
}
