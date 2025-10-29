// removing the duplicates from the array by counting the frequency of the elements
// brute force approach

import java.util.*;

public class A {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 3, 8, 6, 8}; // input array
        int n = arr.length;

        boolean[] visited = new boolean[n]; // to mark already visited elements

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < n; i++) {             // outer loop
            if (!visited[i]) {                    // if element not visited yet
                System.out.print(arr[i] + " ");   // print the unique element once
                for (int j = i + 1; j < n; j++) { // check all other elements
                    if (arr[i] == arr[j]) {       // if duplicate found
                        visited[j] = true;        // mark it as visited
                    }
                }
            }
        }
    }
}

//Time Complexity	O(n²)	For each element, we compare with all remaining elements.
//Space Complexity	O(n)	Extra visited array of size n.
