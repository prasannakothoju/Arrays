//Move all Zeros to the end of the array
//brute force approach
//simple steps:
//Step 1 → Store all non-zero elements in a temporary list.
//Step 2 → Copy those back into the original array from the start.
//Step 3 → Fill the rest with zeros.

import java.util.*;
import java.util.Scanner;

public class A {

    //creating function
    private static void movezeros(int[] arr) {
        int n = arr.length;

        //creating a temp arr to store non zero elements
        ArrayList<Integer> temp = new ArrayList<>();

        // Step 1: Store all non-zero elements into temp list
        for (int num : arr) {
            if (num != 0) {
                temp.add(num);
            }
        }

        // Step 2: Copy elements from temp back to arr
        for (int i = 0; i < temp.size(); i++) {
            arr[i] = temp.get(i);
        }

        // Step 3: Fill remaining positions with zeros
        for (int i = temp.size(); i < n; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4};
        System.out.println("Original array: " + Arrays.toString(arr));

        movezeros(arr);

        System.out.println("Array after moving zeros to end: " + Arrays.toString(arr));

        // ⏱ Time Complexity: O(n)
        // 💾 Space Complexity: O(n)
        // Explanation:
        // - We loop through the array a few times → O(n)
        // - We use an extra ArrayList to store non-zero elements → O(n)
    }
}
