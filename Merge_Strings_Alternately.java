class Solution {
    public String mergeAlternately(String word1, String word2) {
        // Create a StringBuilder to store the result
        StringBuilder res = new StringBuilder();
      
        // Find the maximum length between word1 and word2
        int le = Math.max(word2.length(), word1.length());

        // Iterate through the maximum length
        for (int i = 0; i < le; i++) {
            // Append the character from word1 if it exists
            if (i < word1.length()) {
                res.append(word1.charAt(i));
            }

            // Append the character from word2 if it exists
            if (i < word2.length()) {
                res.append(word2.charAt(i));
             } 
        }

        // Return the merged string
        return res.toString();
    }
}
/*Time Complexity: O(max(m, n)), where m and n are the lengths of word1 and word2, respectively. This is because we iterate through the maximum length between the two words.*/

/*Space Complexity: O(max(m, n)), where m and n are the lengths of word1 and word2, respectively. This is because we store the merged string in the StringBuilder, which can grow 
up to the maximum length between the two words.
*/
