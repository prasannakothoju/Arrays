//Linear Search in Java
//Simple Steps:
//Step 1 → Traverse each element in the array.
//Step 2 → Compare each element with the target number.
//Step 3 → If found, return the index; else, return -1.

import java.util.*;

public class A {

    // Function to perform linear search
    private static int search(int[] arr, int num) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                return i; // return index if element is found
            }
        }
        return -1; // return -1 if element not found
    }

    // Main method to execute the program
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int num = 3;

        int result = search(arr, num);

        if (result == -1)
            System.out.println(num + " not found in the array.");
        else
            System.out.println(num + " found at index: " + result);

        // ⏱ Time Complexity: O(n)
        // 💾 Space Complexity: O(1)
        // Explanation:
        // - We go through each element until we find the target (worst case n times)
        // - We use no extra space, just a few variables
    }
}
