// Longest subarray with given sum K (only positive numbers)
// Optimized approach using Sliding Window (Two Pointer Technique)

import java.util.*;
import java.util.Scanner;

public class A {

    // Example Input: N = 5, k = 10, array[] = {2,3,5,1,9}
    private static int find(int[] arr, int k) {
        int left = 0, right = 0;        // two pointers defining the window range
        int n = arr.length;             // length of the array
        int sum = arr[0];               // initial sum starts with the first element
        int maxlen = 0;                 // variable to store the longest subarray length

        // iterate till right pointer reaches the end of the array
        while (right < n) {

            // if the current window sum is greater than k, shrink the window from the left
            while (left <= right && sum > k) {
                sum -= arr[left];       // subtract the leftmost element
                left++;                 // move left pointer ahead
            }

            // if the current window sum equals k, check for maximum length
            if (sum == k) {
                maxlen = Math.max(maxlen, right - left + 1);
            }

            // expand the window by moving the right pointer forward
            right++;

            // if right is within bounds, add the new element to the current sum
            if (right < n) {
                sum += arr[right];
            }
        }

        return maxlen; // return the length of the longest subarray with sum k
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 9};    // input array
        int k = 10;                     // target sum

        int sol = find(arr, k);         // call the function
        System.out.println("Longest subarray of sum k: " + sol); // expected output: 3 (for {2,3,5})
    }
}


/*
----------------------------
🌸 DRY RUN (Example)
----------------------------
arr = [2, 3, 5, 1, 9], k = 10

Step 1: left=0, right=0 → sum=2
Step 2: sum(2) < 10 → move right → add 3 → sum=5
Step 3: sum(5) < 10 → move right → add 5 → sum=10 ✅
        → sum == k → maxlen = 3 (subarray [2,3,5])
Step 4: move right → add 1 → sum=11 → sum > 10
        → remove arr[left]=2 → sum=9, left=1
Step 5: move right → add 9 → sum=18 → remove arr[1]=3 → sum=15
        → remove arr[2]=5 → sum=10 ✅ → maxlen = 3 (subarray [1,9])
End → Output: 3
----------------------------

⏱️ Time Complexity: O(N)
Because each element is added and removed from the sum at most once.

💾 Space Complexity: O(1)
We only use a few integer variables — no extra data structures.
----------------------------
*/
