// Count Maximum Consecutive One's in the array
// Optimized Approach

import java.util.*;

public class A {
    
    private static int maxcount(int[] arr) {
        int count = 0;     // keeps track of current streak of 1s
        int maxcount = 0;  // stores the maximum streak of 1s found so far
        
        // loop through each number in the array
        for (int num : arr) {
            if (num == 1)
                count++;       // increase streak if 1
            else
                count = 0;     // reset if not 1
            
            // update maxcount whenever count becomes greater
            if (count > maxcount)
                maxcount = count;
        }
        return maxcount;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        int sol = maxcount(arr);
        System.out.println("Count of max consecutive 1's in array: " + sol);
    }
}

/*
Example:
Input: arr = {1, 1, 0, 1, 1, 1}
Output: 3

Step-by-step:
→ num=1 → count=1, max=1
→ num=1 → count=2, max=2
→ num=0 → count=0, max=2
→ num=1 → count=1, max=2
→ num=1 → count=2, max=2
→ num=1 → count=3, max=3

Time Complexity (TC): O(n)
Space Complexity (SC): O(1)
*/
