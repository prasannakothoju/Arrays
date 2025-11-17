// Two Sum : Check if a pair with given sum exists in Array
// 2nd variant: Return indices of the two numbers such that their sum is equal to the target.
// Otherwise, return {-1, -1}
// Brute Force Approach

// Time Complexity (TC): O(n^2)
// Because we check every possible pair using two nested loops.
//
// Space Complexity (SC): O(1)
// We only use a fixed-size array 'ans' of size 2, no extra space growing with input size.

import java.util.*;

public class A {

    // Function to find indices of two numbers whose sum equals the target
    private static int[] find(int[] arr, int target) {

        int n = arr.length;   // length of the array

        int[] ans = new int[2];  // array to store the two indices
        ans[0] = ans[1] = -1;    // initialize both values to -1 (meaning "not found yet")

        // Outer loop to pick the first number
        for (int i = 0; i < n; i++) {

            // Inner loop to pick the second number
            for (int j = i + 1; j < n; j++) {

                // Check if the sum of arr[i] and arr[j] equals the target
                if (arr[i] + arr[j] == target) {

                    ans[0] = i;   // store first index
                    ans[1] = j;   // store second index

                    return ans;   // return immediately since we found the pair
                }
            }
        }

        return ans;  // if no pair found, return [-1, -1]
    }

    public static void main(String[] args) {

        int[] arr = {2, 6, 5, 8, 11};  // input array
        int target = 14;               // target sum

        int[] ans = find(arr, target); // call the function and store the result

        // Print the answer
        System.out.println("Indices of target sum : [" + ans[0] + ", " + ans[1] + "]");
    }
}
