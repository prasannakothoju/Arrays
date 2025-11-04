// Find the number that appears once, and the other numbers twice
// Brute-force approach

import java.util.*;
import java.util.Scanner;

public class A {

    private static int find(int[] arr) {
        int n = arr.length;

        // Outer loop: pick each element
        for (int i = 0; i < n; i++) {
            int count = 0;

            // Inner loop: count how many times it appears
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // If count = 1, that element is unique
            if (count == 1) {
                return arr[i];
            }
        }

        // If not found (shouldn’t happen in valid input)
        return -1;
    }

    public static void main(String[] args) {
        int[] arr =  {4, 1, 2, 1, 2};
        int sol = find(arr);
        System.out.println("Single number in array is: " + sol);
    }
}

/*
Example:
Input: {4, 1, 2, 1, 2}
→ 4 appears once → Output: 4

Time Complexity (TC): O(n²)
Space Complexity (SC): O(1)
*/
