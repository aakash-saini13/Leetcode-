class Solution {
    public int romanToInt(String s) {
        // Initialize the result variable to 0
        int result = 0;
        // Initialize the index variable to 0
        int i = 0;
        
        // Define the values and symbols of the Roman numerals
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        // Iterate through the values and symbols arrays
        for (int j = 0; j < values.length; j++) {
            // Check if the current symbol is present at the current index in the input string
            while (s.startsWith(symbols[j], i)) {
                // If present, add the corresponding value to the result
                result += values[j];
                // Increment the index by the length of the current symbol
                i += symbols[j].length();
            }
        }
        
        // Return the final result
        return result;
    }
}
/*Time Complexity: O(n), where n is the length of the input string s. This is because we iterate through the input string once, and the number of iterations is proportional to the length of the input string.*/

/*Space Complexity: O(1), which means the space complexity is constant. This is because we use a fixed amount of space to store the values and symbols arrays, and the space usage does not grow with the size of the input string.*/

/*Note: The startsWith method has a time complexity of O(m), where m is the length of the symbol being checked. However, since the length of the symbols is bounded ( maximum length is 2), we can consider the time complexity of the startsWith method as O(1). Therefore, the overall time complexity of the solution is O(n).*/
