import java.util.*;

public class Main {
    
    private static int find(int[] arr, int k) {
        int n = arr.length;
        int maxlen = 0;
        
        // Outer loop picks the starting index
        for (int i = 0; i < n; i++) {
            int sum = 0;
            
             // Inner loop picks the ending index
            for (int j = i; j < n; j++) {
                sum += arr[j]; // add the current element to the sum
                
                // If current subarray sum = k, check if its length is largest
                if (sum == k) {
                    maxlen = Math.max(maxlen, j - i + 1);
                }
            }
        }
        return maxlen;
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 9};
        int k = 10;
        int sol = find(arr, k);
        System.out.println("Max len of subarray is: " + sol);
    }
}

/*

🕒 Time Complexity: O(N²)

Because for every element, we check all elements after it.

💾 Space Complexity: O(1)

We use only a few variables (no extra data structures).

*/
