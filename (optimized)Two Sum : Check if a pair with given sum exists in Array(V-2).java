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



// Example: arr = [2, 6, 5, 8, 11], target = 14
//
// Step 1: Create a HashMap to store numbers and their indices
// map = {}
// ans = [-1, -1] by default
//
// Step 2: Start looping through the array
//
// i = 0 → num = 2
// complement = 14 - 2 = 12
// 12 is not in map
// Add 2 to map → map = {2=0}
//
// i = 1 → num = 6
// complement = 14 - 6 = 8
// 8 is not in map
// Add 6 to map → map = {2=0, 6=1}
//
// i = 2 → num = 5
// complement = 14 - 5 = 9
// 9 is not in map
// Add 5 to map → map = {2=0, 6=1, 5=2}
//
// i = 3 → num = 8
// complement = 14 - 8 = 6
// 6 IS present in map at index 1
// So, we found the pair: indices [1, 3]
// ans = [1, 3]
//
// We can stop here because pair found
//
// Final Output: [1, 3]
//
// Why this is fast?
// Instead of checking all combinations, we only scan once.
// HashMap makes complement lookup O(1).
// Final time complexity = O(n)


