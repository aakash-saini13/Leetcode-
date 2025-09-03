class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length(); // get the length of the input string
        for (int i = n / 2; i > 0; i--) { // iterate from half of the length to 1
            if (n % i == 0) { // check if the length is divisible by the current number
                int times = n / i; // calculate how many times the substring repeats
                String tempString = s.substring(0, i); // get the substring
                StringBuilder newString = new StringBuilder(); // create a StringBuilder to build the new string
                while (times-- > 0) { // repeat the substring the calculated number of times
                    newString.append(tempString);
                }
                if (newString.toString().equals(s)) { // check if the built string equals the original string
                    return true; // if it does, return true
                }
            }
        }
        return false; // if no repeated pattern is found, return false
    }
}
