class Solution {
   public boolean isAnagram(String s, String t) {
        // Get the lengths of both strings
        int m = s.length();
        int n = t.length();

        // If the lengths are not equal, the strings cannot be anagrams
        if (m != n) {
            return false;
        } else {
            // Create a count array to store the frequency of each character
            int count[] = new int[26];

            // Count the frequency of each character in the first string
            for (int i = 0; i < m; i++) {
                count[s.charAt(i) - 'a']++;
            }

            // Subtract the frequency of each character in the second string
            for (int i = 0; i < n; i++) {
                count[t.charAt(i) - 'a']--;
            }

            // Check if all counts are zero
            for (int i = 0; i < count.length; i++) {
                if (count[i] != 0) {
                    // If any count is not zero, the strings are not anagrams
                    return false;
                }
            }
        }
        // If all counts are zero, the strings are anagrams
        return true;
    }
}
