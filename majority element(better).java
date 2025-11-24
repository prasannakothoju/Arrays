// Find the Majority Element that occurs more than N/2 times
// Better Approach using HashMap (Counting Frequency)

// Time Complexity (TC): O(n)  
// - One loop to count frequencies
// - One loop to find the majority element
// - Total: O(n)

// Space Complexity (SC): O(n)  
// - HashMap stores at most n different elements

import java.util.*;

public class A {

    // Function to find majority element
    private static int find(int[] arr) {

        int n = arr.length;

        // HashMap to store each number and its count
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency of each number
        for (int i = 0; i < n; i++) {
            // If number exists → get count
            // Else → default count = 0
            int value = map.getOrDefault(arr[i], 0);

            // Increase count by 1
            map.put(arr[i], value + 1);
        }

        // Step 2: Check which number appears more than n/2 times
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {

            // e.getKey() → number
            // e.getValue() → its count
            if (e.getValue() > (n / 2)) {
                return e.getKey(); // return majority element
            }
        }

        // No majority element
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 1, 1, 1, 2, 2};

        int sol = find(arr);

        System.out.println("Major element in the array is : " + sol);
    }
}
