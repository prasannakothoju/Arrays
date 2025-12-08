// Kadane's Algorithm : Maximum Subarray Sum in an Array
// Time Complexity (TC): O(n)
// Space Complexity (SC): O(1)
// Very efficient solution — checks array only once and uses constant space.

import java.util.*;

public class A {

    // Function to calculate maximum subarray sum
    private static int sum(int[] arr) {
        
        int n = arr.length;

        // maxsum stores the best (maximum) sum found so far
        // We start with the first element to handle cases where all elements are negative
        int maxsum = arr[0];

        // currentsum keeps adding values as we move through the array
        int currentsum = 0;

        // Loop through each element in the array
        for (int num : arr) {

            // Add the current element to running sum
            currentsum += num;

            // Update maxsum if currentsum is greater
            if (currentsum > maxsum) {
                maxsum = currentsum;
            }

            // If running sum becomes negative, reset it to 0
            // because negative sum will reduce the value of future subarrays
            if (currentsum < 0) {
                currentsum = 0;
            }
        }

        // Return the maximum subarray sum found
        return maxsum;
    }

    public static void main(String[] args) {
        
        // Example array
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Call the sum() function
        int sol = sum(arr);

        // Print result
        System.out.println("Max sub array sum is " + sol);
    }
}
