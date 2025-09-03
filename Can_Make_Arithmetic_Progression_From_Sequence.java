class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        // Initialize variables to track the indices of the minimum and maximum values
        int mn = 0;
        int mx = 0;
        // Create a boolean array to track the presence of each difference value
        boolean[] mem = new boolean[arr.length];
        // Calculate the length of the array minus one
        int n = arr.length - 1;
        
        // Iterate through the array to find the minimum and maximum values
        for(int i = 1; i <= n; i++) {
            if(arr[i] < arr[mn]) {
                // Update the index of the minimum value
                mn = i;
            } else if(arr[i] > arr[mx]) {
                // Update the index of the maximum value
                mx = i;
            }
        }
        
        // If the minimum and maximum values are equal, the array is already an arithmetic progression
        if(arr[mn] == arr[mx]) {
            return true;
        }
        
        // Check if the difference between the maximum and minimum values is divisible by the length of the array minus one
        if((arr[mx] - arr[mn]) % n != 0) {
            // If not, the array cannot be an arithmetic progression
            return false;
        }
        
        // Calculate the common difference
        int d = (arr[mx] - arr[mn]) / n;
        
        // Mark the presence of the minimum and maximum values in the boolean array
        mem[0] = true;
        mem[n] = true;
        
        // Iterate through the array to check if each value can be part of an arithmetic progression
        for(int i = 0; i <= n; i++) {
            if(i == mn || i == mx) {
                // Skip the minimum and maximum values
                continue;
            }
            // Check if the difference between the current value and the minimum value is divisible by the common difference
            if((arr[i] - arr[mn]) % d != 0) {
                // If not, the array cannot be an arithmetic progression
                return false;
            }
            // Calculate the index of the current value in the boolean array
            int di = (arr[i] - arr[mn]) / d;
            // Check if the current value is already present in the boolean array
            if(mem[di]) {
                // If so, the array cannot be an arithmetic progression
                return false;
            }
            // Mark the presence of the current value in the boolean array
            mem[di] = true;
        }
        
        // If all checks pass, the array can be an arithmetic progression
        return true;
    }
}

/*Time Complexity: O(n), where n is the length of the input array arr. This is because we iterate through the array twice: once to find the minimum and maximum values, and once to check if each value can be part of an arithmetic progression.

Space Complexity: O(n), where n is the length of the input array arr. This is because we create a boolean array of the same length as the input array to track the presence of each difference value.*/
