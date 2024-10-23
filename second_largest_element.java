// User function Template for Java
// Sorting an array can give us the second largest as arr[n-2] if no duplicates exist
// However, sorting has a time complexity of O(n log n)
// Sorting also doesn't work if elements are repeated in the array
/*
Example walk-through:
arr = [12, 35, 1, 10, 34, 1]
1 -> 12 > max, so update max = 12, secondmax = Integer.MIN_VALUE
2 -> 35 > max (12), so update secondmax = 12, max = 35
3 -> 1 < max (35) and 1 < secondmax (12), no update
4 -> 10 < max (35) and 10 < secondmax (12), no update
5 -> 34 < max (35) and 34 > secondmax (12), so update secondmax = 34
6 -> 1 < max (35) and 1 < secondmax (34), no update
*/

class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        
        // If array has fewer than 2 elements, second largest doesn't exist
        if (n < 2) {
            return -1;
        }

        // Initialize max and secondmax to the smallest possible integer value
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        // Traverse the array to find max and secondmax
        for (int i = 0; i < n; i++) {
            // If current element is greater than max, update secondmax and max
            if (arr[i] > max) {  
                secondmax = max;  // Update secondmax to the old max
                max = arr[i];     // Update max to current element
            }
            // If current element is between max and secondmax, update secondmax
            else if (arr[i] < max && arr[i] > secondmax) {
                secondmax = arr[i];
            }
        }
        
        // If secondmax hasn't changed from its initial value, return -1 (no second largest element)
        return (secondmax == Integer.MIN_VALUE) ? -1 : secondmax;
    }
}
