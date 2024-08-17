class Solution {
  
    public char findTheDifference(String s, String t) {
        // Initialize a variable to store the sum of the ASCII values of the characters in string t
        int total = 0;
        
        // Calculate the sum of the ASCII values of the characters in string t
        for (int i = 0; i < t.length(); i++) {
            total += t.charAt(i);
        }
        
        // Subtract the sum of the ASCII values of the characters in string s from the total
        for (int i = 0; i < s.length(); i++) {
            total -= s.charAt(i);
        }
        
        // The result will be the ASCII value of the character that is present in string t but not in string s
        // Cast the result to a char to get the character
        return (char) total;
    }
}

/*Time Complexity: O(m + n), where m and n are the lengths of strings s and t, respectively. This is because we iterate through each string once to calculate the sum of the ASCII values of their characters.*/

/*Space Complexity: O(1), which means the space complexity is constant. This is because we only use a single variable total to store the sum of the ASCII values, which does not depend on the size of the input strings.*/
