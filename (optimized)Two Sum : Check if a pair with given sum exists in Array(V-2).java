// Two Sum : Variant 2 (Optimized)
// Return indices of the two numbers such that arr[i] + arr[j] = target.
// If no pair exists → return [-1, -1].

// Time Complexity (TC): O(n)
// We scan the array only once using a HashMap.
//
// Space Complexity (SC): O(n)
// HashMap stores the value → index mappings.

import java.util.*;

public class A {

    // Function to return indices of two numbers that sum to the target
    private static int[] find(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();  
        // key = number, value = index

        int[] ans = new int[2];
        ans[0] = ans[1] = -1;   // initialize default answer

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];
            int complement = target - num;

            // If complement already exists in map → we found the pair
            if (map.containsKey(complement)) {
                ans[0] = map.get(complement);  // index of complement
                ans[1] = i;                    // current index
                return ans;
            }

            // Otherwise store this number with its index
            map.put(num, i);
        }

        return ans;   // return [-1, -1] if no pair
    }

    public static void main(String[] args) {

        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;

        int[] ans = find(arr, target);

        System.out.println("Indices of target sum : [" + ans[0] + ", " + ans[1] + "]");
    }
}
