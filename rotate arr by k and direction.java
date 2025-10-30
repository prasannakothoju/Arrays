import java.util.*;

public class Main {
    // Function to rotate the array
    public static void rotate(int[] arr, int k, String direction) {
        int n = arr.length;
        k = k % n; // handle cases when k > n

        if (direction.equalsIgnoreCase("right")) {
            // Step 1: Reverse entire array
            reverse(arr, 0, n - 1);
            // Step 2: Reverse first k elements
            reverse(arr, 0, k - 1);
            // Step 3: Reverse remaining elements
            reverse(arr, k, n - 1);
        } 
        else if (direction.equalsIgnoreCase("left")) {
            // Step 1: Reverse first k elements
            reverse(arr, 0, k - 1);
            // Step 2: Reverse remaining elements
            reverse(arr, k, n - 1);
            // Step 3: Reverse entire array
            reverse(arr, 0, n - 1);
        }
    }

    // Helper function to reverse part of the array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        String direction = "right"; // change to "left" if needed

        rotate(arr, k, direction);

        for (int num : arr) System.out.print(num + " ");
    }
}

// Time Complexity: O(n)
// -> Each element is reversed at most once.
// Space Complexity: O(1)
// -> In-place rotation without using extra space.
