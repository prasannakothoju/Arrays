//remove duplicates from the array
//bruteforce

import java.util.*;

public class A {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 5, 4, 6, 7, 7};
        int n = arr.length;

        // Print original array
        System.out.println("Original array: " + Arrays.toString(arr));

        // Step 1: Sort the array
        Arrays.sort(arr);

        System.out.print("Array after removing duplicates: ");
        
        // Step 2: Print unique elements
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) { // comparing consecutive elements
                System.out.print(arr[i] + " ");
            }
        }
        // print last element (it won’t be compared)
        System.out.print(arr[n - 1]);
    }
}

//TC: O(n log n)
// SC: O(1)
