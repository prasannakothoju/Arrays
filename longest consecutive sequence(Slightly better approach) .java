//another brute force
// longest consecutive sequence in the array

// Overall Time Complexity: Sorting O(n log n) + Loop O(n) = O(n log n)
// Space Complexity: No extra data structures used → O(1)

import java.util.*;
import java.util.Scanner;
import java.util.Collections;

public class A{
    private static int find(int[] arr){
        
        int n = arr.length;
        // If the array is empty, there are no elements → return 0
        if(n == 0) return 0;
        
        //sort the array first
        Arrays.sort(arr); // Time Complexity of sorting: O(n log n)
        
        //initially adding first num
        int longest = 1; //sequence length
        int count = 1;
        // These variables take constant space → O(1)
        
        //go thr entire array
        for(int i=1;i<n ;i++){    // This loop runs n times → O(n)
            
            //remove dups if any
              // If current number is same as previous (duplicate)
            if(arr[i] == arr[i-1]){
                continue ; //skip them
            }
            
             // If current number is exactly 1 greater than previous
            if(arr[i] == arr[i-1] + 1){   // FIX 2
                count++; //inc the count
            }
            else{
                count =1 ; // Sequence is broken → reset count to 1
            }
            
            longest = Math.max(longest,count);
        }
        
        return longest;
    }
    
    public static void main(String[] args){
        int[] arr = {100, 4, 200, 1, 3, 2};
        int sol = find(arr);
        System.out.println(sol);
    }
}
